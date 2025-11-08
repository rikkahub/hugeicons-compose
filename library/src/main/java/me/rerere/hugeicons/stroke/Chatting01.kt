package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chatting01: ImageVector
    get() {
        if (_chatting01 != null) {
            return _chatting01!!
        }
        _chatting01 = ImageVector.Builder(
            name = "Chatting01",
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
        moveTo(20f, 9f)
        curveTo(19.2048f, 5.01455f, 15.5128f, 2f, 11.0793f, 2f)
        curveTo(6.06549f, 2f, 2f, 5.85521f, 2f, 10.61f)
        curveTo(2f, 12.8946f, 2.93819f, 14.9704f, 4.46855f, 16.5108f)
        curveTo(4.80549f, 16.85f, 5.03045f, 17.3134f, 4.93966f, 17.7903f)
        curveTo(4.78982f, 18.5701f, 4.45026f, 19.2975f, 3.95305f, 19.9037f)
        curveTo(5.26123f, 20.1449f, 6.62147f, 19.9277f, 7.78801f, 19.3127f)
        curveTo(8.20039f, 19.0954f, 8.40657f, 18.9867f, 8.55207f, 18.9646f)
        curveTo(8.65392f, 18.9492f, 8.78659f, 18.9636f, 9f, 19.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.2617f)
        curveTo(11f, 19.1674f, 13.4628f, 21.5234f, 16.5f, 21.5234f)
        curveTo(16.8571f, 21.5238f, 17.2132f, 21.4908f, 17.564f, 21.425f)
        curveTo(17.8165f, 21.3775f, 17.9428f, 21.3538f, 18.0309f, 21.3673f)
        curveTo(18.119f, 21.3807f, 18.244f, 21.4472f, 18.4938f, 21.58f)
        curveTo(19.2004f, 21.9558f, 20.0244f, 22.0885f, 20.8169f, 21.9411f)
        curveTo(20.5157f, 21.5707f, 20.31f, 21.1262f, 20.2192f, 20.6496f)
        curveTo(20.1642f, 20.3582f, 20.3005f, 20.075f, 20.5046f, 19.8677f)
        curveTo(21.4317f, 18.9263f, 22f, 17.6578f, 22f, 16.2617f)
        curveTo(22f, 13.356f, 19.5372f, 11f, 16.5f, 11f)
        curveTo(13.4628f, 11f, 11f, 13.356f, 11f, 16.2617f)
        }
        }.build()

        return _chatting01!!
    }

private var _chatting01: ImageVector? = null
