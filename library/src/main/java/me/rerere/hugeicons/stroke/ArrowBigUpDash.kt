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

val HugeIcons.ArrowBigUpDash: ImageVector
    get() {
        if (_arrowBigUpDash != null) {
            return _arrowBigUpDash!!
        }
        _arrowBigUpDash = ImageVector.Builder(
            name = "ArrowBigUpDash",
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
            moveTo(9f, 21f)
            horizontalLineTo(15f)
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
            moveTo(14.9351f, 5.27643f)
            lineTo(17.3928f, 7.99539f)
            curveTo(19.335f, 10.1441f, 20.3061f, 11.2184f, 19.9143f, 12.1092f)
            curveTo(19.5225f, 13f, 18.0788f, 13f, 15.1915f, 13f)
            horizontalLineTo(15f)
            verticalLineTo(14f)
            curveTo(15f, 15.4142f, 15f, 16.1213f, 14.5607f, 16.5607f)
            curveTo(14.1213f, 17f, 13.4142f, 17f, 12f, 17f)
            curveTo(10.5858f, 17f, 9.87868f, 17f, 9.43934f, 16.5607f)
            curveTo(9f, 16.1213f, 9f, 15.4142f, 9f, 14f)
            verticalLineTo(13f)
            horizontalLineTo(8.80852f)
            curveTo(5.92117f, 13f, 4.47749f, 13f, 4.08568f, 12.1092f)
            curveTo(3.69387f, 11.2184f, 4.66499f, 10.1441f, 6.60724f, 7.99538f)
            lineTo(9.06495f, 5.27642f)
            curveTo(10.4367f, 3.75881f, 11.1226f, 3f, 12f, 3f)
            curveTo(12.8774f, 3f, 13.5633f, 3.75881f, 14.9351f, 5.27643f)
            close()
        }
        }.build()

        return _arrowBigUpDash!!
    }

private var _arrowBigUpDash: ImageVector? = null
