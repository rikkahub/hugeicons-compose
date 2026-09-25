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

val HugeIcons.ArrowBigLeftDash: ImageVector
    get() {
        if (_arrowBigLeftDash != null) {
            return _arrowBigLeftDash!!
        }
        _arrowBigLeftDash = ImageVector.Builder(
            name = "ArrowBigLeftDash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(21f, 9f)
            lineTo(21f, 15f)
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
            moveTo(5.27643f, 14.9351f)
            lineTo(7.99539f, 17.3928f)
            curveTo(10.1441f, 19.335f, 11.2184f, 20.3061f, 12.1092f, 19.9143f)
            curveTo(13f, 19.5225f, 13f, 18.0788f, 13f, 15.1915f)
            verticalLineTo(15f)
            horizontalLineTo(14f)
            curveTo(15.4142f, 15f, 16.1213f, 15f, 16.5607f, 14.5607f)
            curveTo(17f, 14.1213f, 17f, 13.4142f, 17f, 12f)
            curveTo(17f, 10.5858f, 17f, 9.87868f, 16.5607f, 9.43934f)
            curveTo(16.1213f, 9f, 15.4142f, 9f, 14f, 9f)
            horizontalLineTo(13f)
            verticalLineTo(8.80852f)
            curveTo(13f, 5.92117f, 13f, 4.47749f, 12.1092f, 4.08568f)
            curveTo(11.2184f, 3.69387f, 10.1441f, 4.66499f, 7.99538f, 6.60723f)
            lineTo(5.27642f, 9.06495f)
            curveTo(3.75881f, 10.4367f, 3f, 11.1226f, 3f, 12f)
            curveTo(3f, 12.8774f, 3.75881f, 13.5633f, 5.27643f, 14.9351f)
            close()
        }
        }.build()

        return _arrowBigLeftDash!!
    }

private var _arrowBigLeftDash: ImageVector? = null
