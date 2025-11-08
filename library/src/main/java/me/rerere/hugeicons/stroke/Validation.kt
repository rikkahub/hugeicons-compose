package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Validation: ImageVector
    get() {
        if (_validation != null) {
            return _validation!!
        }
        _validation = ImageVector.Builder(
            name = "Validation",
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
        moveTo(17.6034f, 8.58326f)
        lineTo(18.8152f, 7.77534f)
        curveTo(19.4562f, 7.34802f, 20.234f, 7.14124f, 20.8709f, 6.70794f)
        curveTo(21.003f, 6.61809f, 21.1286f, 6.5146f, 21.2457f, 6.39747f)
        curveTo(22.2514f, 5.39149f, 22.2514f, 3.76047f, 21.2457f, 2.75449f)
        curveTo(20.2399f, 1.7485f, 18.6092f, 1.7485f, 17.6034f, 2.75449f)
        curveTo(17.4863f, 2.87161f, 17.3828f, 2.99721f, 17.293f, 3.12931f)
        curveTo(16.8598f, 3.76635f, 16.653f, 4.54433f, 16.2258f, 5.1854f)
        lineTo(15.418f, 6.39747f)
        moveTo(17.6034f, 8.58326f)
        lineTo(15.418f, 6.39747f)
        moveTo(17.6034f, 8.58326f)
        lineTo(19.3012f, 11.2518f)
        curveTo(19.7989f, 12.034f, 19.6866f, 13.057f, 19.0311f, 13.7126f)
        curveTo(18.6449f, 14.0989f, 18.0188f, 14.0989f, 17.6326f, 13.7126f)
        lineTo(10.2896f, 6.36828f)
        curveTo(9.90345f, 5.98201f, 9.90345f, 5.35574f, 10.2896f, 4.96947f)
        curveTo(10.9451f, 4.31385f, 11.968f, 4.20155f, 12.75f, 4.69933f)
        lineTo(15.418f, 6.39747f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16.8943f)
        curveTo(15.1213f, 19.8469f, 12.3861f, 22f, 9.148f, 22f)
        curveTo(5.20027f, 22f, 2f, 18.7997f, 2f, 14.852f)
        curveTo(2f, 11.6139f, 4.15309f, 8.87874f, 7.10572f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15.6667f)
        curveTo(7f, 15.6667f, 7.625f, 15.6667f, 8.25f, 17f)
        curveTo(8.25f, 17f, 10.2353f, 13.6667f, 12f, 13f)
        }
        }.build()

        return _validation!!
    }

private var _validation: ImageVector? = null
