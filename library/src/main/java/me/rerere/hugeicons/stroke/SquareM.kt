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

val HugeIcons.SquareM: ImageVector
    get() {
        if (_squareM != null) {
            return _squareM!!
        }
        _squareM = ImageVector.Builder(
            name = "SquareM",
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
            moveTo(12f, 21.5f)
            horizontalLineTo(12f)
            horizontalLineTo(12f)
            curveTo(16.4784f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
            curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
            verticalLineTo(12f)
            verticalLineTo(12f)
            curveTo(21.5f, 7.52165f, 21.5f, 5.28248f, 20.1088f, 3.89124f)
            curveTo(18.7175f, 2.5f, 16.4784f, 2.5f, 12f, 2.5f)
            curveTo(7.52169f, 2.5f, 5.28252f, 2.5f, 3.89127f, 3.89124f)
            curveTo(2.50003f, 5.28249f, 2.50003f, 7.52166f, 2.50003f, 12f)
            curveTo(2.50003f, 16.4783f, 2.50003f, 18.7175f, 3.89127f, 20.1088f)
            curveTo(5.28251f, 21.5f, 7.52168f, 21.5f, 12f, 21.5f)
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
            moveTo(7.99997f, 16f)
            verticalLineTo(8.63849f)
            curveTo(7.99997f, 8.28586f, 8.28583f, 8f, 8.63846f, 8f)
            curveTo(8.86274f, 8f, 9.07057f, 8.11767f, 9.18596f, 8.30999f)
            lineTo(12f, 13f)
            lineTo(14.814f, 8.30999f)
            curveTo(14.9294f, 8.11767f, 15.1372f, 8f, 15.3615f, 8f)
            curveTo(15.7141f, 8f, 16f, 8.28586f, 16f, 8.63849f)
            verticalLineTo(16f)
        }
        }.build()

        return _squareM!!
    }

private var _squareM: ImageVector? = null
