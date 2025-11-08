package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeUp01: ImageVector
    get() {
        if (_swipeUp01 != null) {
            return _swipeUp01!!
        }
        _swipeUp01 = ImageVector.Builder(
            name = "SwipeUp01",
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
        moveTo(18.5f, 2.00391f)
        verticalLineTo(8.00156f)
        moveTo(18.5f, 2.00391f)
        curveTo(17.7998f, 2.00391f, 16.4915f, 3.99743f, 16f, 4.50293f)
        moveTo(18.5f, 2.00391f)
        curveTo(19.2002f, 2.00391f, 20.5085f, 3.99743f, 21f, 4.50293f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8932f, 21.9882f)
        curveTo(16.8415f, 20.075f, 16.9704f, 19.8446f, 17.1071f, 19.419f)
        curveTo(17.2438f, 18.9934f, 18.2001f, 17.4585f, 18.5385f, 16.3619f)
        curveTo(19.6332f, 12.814f, 18.6129f, 12.0594f, 17.2526f, 11.0533f)
        curveTo(15.7441f, 9.93752f, 12.8988f, 9.37245f, 11.4877f, 9.49478f)
        verticalLineTo(3.74357f)
        curveTo(11.4877f, 2.78062f, 10.7067f, 2f, 9.74341f, 2f)
        curveTo(8.78009f, 2f, 7.99916f, 2.78062f, 7.99916f, 3.74357f)
        verticalLineTo(14.0031f)
        lineTo(5.93899f, 11.8237f)
        curveTo(5.29937f, 11.1302f, 4.27146f, 11.0599f, 3.56992f, 11.6907f)
        curveTo(2.90511f, 12.2885f, 2.80809f, 13.2952f, 3.34652f, 14.0089f)
        lineTo(4.63886f, 15.7218f)
        moveTo(7.8698f, 22f)
        lineTo(7.85027f, 20.9496f)
        curveTo(7.89321f, 19.7183f, 6.99722f, 18.9149f, 5.82864f, 17.3087f)
        curveTo(5.74445f, 17.193f, 5.66252f, 17.0811f, 5.58275f, 16.9729f)
        moveTo(5.58275f, 16.9729f)
        curveTo(5.22869f, 16.4924f, 4.91716f, 16.0831f, 4.63886f, 15.7218f)
        moveTo(5.58275f, 16.9729f)
        lineTo(6.75217f, 18.5229f)
        moveTo(5.58275f, 16.9729f)
        lineTo(4.63886f, 15.7218f)
        moveTo(4.63886f, 15.7218f)
        curveTo(4.06749f, 14.9801f, 3.63617f, 14.441f, 3.26433f, 13.9055f)
        }
        }.build()

        return _swipeUp01!!
    }

private var _swipeUp01: ImageVector? = null
