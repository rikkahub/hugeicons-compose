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

val HugeIcons.ArrowBigDownDash: ImageVector
    get() {
        if (_arrowBigDownDash != null) {
            return _arrowBigDownDash!!
        }
        _arrowBigDownDash = ImageVector.Builder(
            name = "ArrowBigDownDash",
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
            moveTo(14.9351f, 18.7236f)
            lineTo(17.3928f, 16.0046f)
            curveTo(19.335f, 13.8559f, 20.3061f, 12.7816f, 19.9143f, 11.8908f)
            curveTo(19.5225f, 11f, 18.0788f, 11f, 15.1915f, 11f)
            horizontalLineTo(15f)
            verticalLineTo(10f)
            curveTo(15f, 8.58579f, 15f, 7.87868f, 14.5607f, 7.43934f)
            curveTo(14.1213f, 7f, 13.4142f, 7f, 12f, 7f)
            curveTo(10.5858f, 7f, 9.87868f, 7f, 9.43934f, 7.43934f)
            curveTo(9f, 7.87868f, 9f, 8.58579f, 9f, 10f)
            verticalLineTo(11f)
            horizontalLineTo(8.80852f)
            curveTo(5.92117f, 11f, 4.47749f, 11f, 4.08568f, 11.8908f)
            curveTo(3.69387f, 12.7816f, 4.66499f, 13.8559f, 6.60724f, 16.0046f)
            lineTo(9.06495f, 18.7236f)
            curveTo(10.4367f, 20.2412f, 11.1226f, 21f, 12f, 21f)
            curveTo(12.8774f, 21f, 13.5633f, 20.2412f, 14.9351f, 18.7236f)
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
            moveTo(9f, 3f)
            horizontalLineTo(15f)
        }
        }.build()

        return _arrowBigDownDash!!
    }

private var _arrowBigDownDash: ImageVector? = null
