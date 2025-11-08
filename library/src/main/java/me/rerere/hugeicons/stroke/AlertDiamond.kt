package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlertDiamond: ImageVector
    get() {
        if (_alertDiamond != null) {
            return _alertDiamond!!
        }
        _alertDiamond = ImageVector.Builder(
            name = "AlertDiamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 12.6863f)
        verticalLineTo(11.3137f)
        curveTo(21.5f, 9.67871f, 21.5f, 8.8612f, 21.1955f, 8.12612f)
        curveTo(20.891f, 7.39104f, 20.313f, 6.81297f, 19.1569f, 5.65685f)
        lineTo(18.3431f, 4.84315f)
        curveTo(17.187f, 3.68702f, 16.609f, 3.10896f, 15.8739f, 2.80448f)
        curveTo(15.1388f, 2.5f, 14.3213f, 2.5f, 12.6863f, 2.5f)
        horizontalLineTo(11.3137f)
        curveTo(9.67871f, 2.5f, 8.8612f, 2.5f, 8.12612f, 2.80448f)
        curveTo(7.39104f, 3.10896f, 6.81297f, 3.68702f, 5.65685f, 4.84315f)
        lineTo(4.84315f, 5.65685f)
        curveTo(3.68702f, 6.81298f, 3.10896f, 7.39104f, 2.80448f, 8.12612f)
        curveTo(2.5f, 8.8612f, 2.5f, 9.67871f, 2.5f, 11.3137f)
        verticalLineTo(12.6863f)
        curveTo(2.5f, 14.3213f, 2.5f, 15.1388f, 2.80448f, 15.8739f)
        curveTo(3.10896f, 16.609f, 3.68702f, 17.187f, 4.84315f, 18.3431f)
        lineTo(5.65685f, 19.1569f)
        curveTo(6.81297f, 20.313f, 7.39104f, 20.891f, 8.12612f, 21.1955f)
        curveTo(8.8612f, 21.5f, 9.67871f, 21.5f, 11.3137f, 21.5f)
        horizontalLineTo(12.6863f)
        curveTo(14.3213f, 21.5f, 15.1388f, 21.5f, 15.8739f, 21.1955f)
        curveTo(16.609f, 20.891f, 17.187f, 20.313f, 18.3431f, 19.1569f)
        lineTo(19.1569f, 18.3431f)
        curveTo(20.313f, 17.187f, 20.891f, 16.609f, 21.1955f, 15.8739f)
        curveTo(21.5f, 15.1388f, 21.5f, 14.3213f, 21.5f, 12.6863f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        lineTo(12f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15.9883f)
        verticalLineTo(15.9983f)
        }
        }.build()

        return _alertDiamond!!
    }

private var _alertDiamond: ImageVector? = null
