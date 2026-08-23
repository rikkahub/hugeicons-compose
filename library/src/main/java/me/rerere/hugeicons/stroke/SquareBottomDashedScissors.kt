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

val HugeIcons.SquareBottomDashedScissors: ImageVector
    get() {
        if (_squareBottomDashedScissors != null) {
            return _squareBottomDashedScissors!!
        }
        _squareBottomDashedScissors = ImageVector.Builder(
            name = "SquareBottomDashedScissors",
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
            moveTo(10f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 7f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 10f, 8.5f)
            close()
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
            moveTo(10f, 10f)
            lineTo(12f, 12f)
            moveTo(17f, 17f)
            lineTo(14.5f, 14.5f)
            moveTo(10f, 14f)
            lineTo(12f, 12f)
            moveTo(17f, 7f)
            lineTo(12f, 12f)
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
            moveTo(10f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 7f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 10f, 15.5f)
            close()
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
            moveTo(14f, 21.5f)
            curveTo(14.5395f, 21.4948f, 15.0381f, 21.4851f, 15.5f, 21.4669f)
            moveTo(10.0001f, 21.5f)
            curveTo(9.46061f, 21.4948f, 8.96192f, 21.4851f, 8.5f, 21.4669f)
            moveTo(19f, 20.8693f)
            curveTo(19.4255f, 20.6797f, 19.7894f, 20.4336f, 20.1088f, 20.1142f)
            curveTo(21.5f, 18.7225f, 21.5f, 16.4827f, 21.5f, 12.0029f)
            curveTo(21.5f, 7.52321f, 21.5f, 5.28334f, 20.1088f, 3.89167f)
            curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
            curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89167f)
            curveTo(2.5f, 5.28334f, 2.5f, 7.52321f, 2.5f, 12.0029f)
            curveTo(2.5f, 16.4827f, 2.5f, 18.7225f, 3.89124f, 20.1142f)
            curveTo(4.21056f, 20.4336f, 4.57453f, 20.6797f, 5f, 20.8693f)
        }
        }.build()

        return _squareBottomDashedScissors!!
    }

private var _squareBottomDashedScissors: ImageVector? = null
