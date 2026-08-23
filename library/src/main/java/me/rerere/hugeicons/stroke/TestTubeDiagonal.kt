package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TestTubeDiagonal: ImageVector
    get() {
        if (_testTubeDiagonal != null) {
            return _testTubeDiagonal!!
        }
        _testTubeDiagonal = ImageVector.Builder(
            name = "TestTubeDiagonal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 2.5f)
            lineTo(21.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.5f, 8.5f)
            lineTo(8.5355f, 20.4645f)
            curveTo(7.87246f, 21.1275f, 6.97319f, 21.5f, 6.0355f, 21.5f)
            curveTo(4.08288f, 21.5f, 2.49997f, 19.9171f, 2.49997f, 17.9645f)
            curveTo(2.49997f, 17.0268f, 2.87246f, 16.1275f, 3.5355f, 15.4645f)
            lineTo(15.5f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.5f, 12.5f)
            horizontalLineTo(16.5f)
        }
        }.build()

        return _testTubeDiagonal!!
    }

private var _testTubeDiagonal: ImageVector? = null
