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

val HugeIcons.ArrowBigRightDash: ImageVector
    get() {
        if (_arrowBigRightDash != null) {
            return _arrowBigRightDash!!
        }
        _arrowBigRightDash = ImageVector.Builder(
            name = "ArrowBigRightDash",
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
            moveTo(18.7236f, 9.06494f)
            lineTo(16.0046f, 6.60723f)
            curveTo(13.8559f, 4.66499f, 12.7816f, 3.69387f, 11.8908f, 4.08568f)
            curveTo(11f, 4.47749f, 11f, 5.92117f, 11f, 8.80852f)
            verticalLineTo(9f)
            horizontalLineTo(10f)
            curveTo(8.58579f, 9f, 7.87868f, 9f, 7.43934f, 9.43934f)
            curveTo(7f, 9.87868f, 7f, 10.5858f, 7f, 12f)
            curveTo(7f, 13.4142f, 7f, 14.1213f, 7.43934f, 14.5607f)
            curveTo(7.87868f, 15f, 8.58579f, 15f, 10f, 15f)
            horizontalLineTo(11f)
            verticalLineTo(15.1915f)
            curveTo(11f, 18.0788f, 11f, 19.5225f, 11.8908f, 19.9143f)
            curveTo(12.7816f, 20.3061f, 13.8559f, 19.335f, 16.0046f, 17.3928f)
            lineTo(18.7236f, 14.9351f)
            curveTo(20.2412f, 13.5633f, 21f, 12.8774f, 21f, 12f)
            curveTo(21f, 11.1226f, 20.2412f, 10.4367f, 18.7236f, 9.06494f)
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
            moveTo(3f, 9f)
            verticalLineTo(15f)
        }
        }.build()

        return _arrowBigRightDash!!
    }

private var _arrowBigRightDash: ImageVector? = null
