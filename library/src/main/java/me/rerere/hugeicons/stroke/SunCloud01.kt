package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SunCloud01: ImageVector
    get() {
        if (_sunCloud01 != null) {
            return _sunCloud01!!
        }
        _sunCloud01 = ImageVector.Builder(
            name = "SunCloud01",
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
        moveTo(17.4776f, 11.0001f)
        curveTo(17.485f, 11f, 17.4925f, 11f, 17.5f, 11f)
        curveTo(19.9853f, 11f, 22f, 13.0147f, 22f, 15.5f)
        curveTo(22f, 17.9853f, 19.9853f, 20f, 17.5f, 20f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 20f, 2f, 17.7614f, 2f, 15f)
        curveTo(2f, 12.4003f, 3.98398f, 10.2641f, 6.52042f, 10.0227f)
        moveTo(17.4776f, 11.0001f)
        curveTo(17.4924f, 10.8354f, 17.5f, 10.6686f, 17.5f, 10.5f)
        curveTo(17.5f, 7.46243f, 15.0376f, 5f, 12f, 5f)
        curveTo(9.12324f, 5f, 6.76233f, 7.20862f, 6.52042f, 10.0227f)
        moveTo(17.4776f, 11.0001f)
        curveTo(17.3753f, 12.1345f, 16.9286f, 13.1696f, 16.2428f, 14f)
        moveTo(6.52042f, 10.0227f)
        curveTo(6.67826f, 10.0077f, 6.83823f, 10f, 7f, 10f)
        curveTo(8.12582f, 10f, 9.16474f, 10.3721f, 10.0005f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5.65468f)
        curveTo(8.30552f, 4.65451f, 7.15088f, 4f, 5.84388f, 4f)
        curveTo(3.72096f, 4f, 2f, 5.72674f, 2f, 7.85679f)
        curveTo(2f, 9.15354f, 2.63783f, 10.3008f, 3.61588f, 11f)
        }
        }.build()

        return _sunCloud01!!
    }

private var _sunCloud01: ImageVector? = null
