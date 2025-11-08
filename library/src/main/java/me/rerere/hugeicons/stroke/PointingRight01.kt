package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingRight01: ImageVector
    get() {
        if (_pointingRight01 != null) {
            return _pointingRight01!!
        }
        _pointingRight01 = ImageVector.Builder(
            name = "PointingRight01",
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
        moveTo(22.0022f, 4.5f)
        horizontalLineTo(16.0059f)
        moveTo(22.0022f, 4.5f)
        curveTo(22.0022f, 3.79977f, 20.0091f, 2.49153f, 19.5037f, 2f)
        moveTo(22.0022f, 4.5f)
        curveTo(22.0022f, 5.20023f, 20.0091f, 6.50847f, 19.5037f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99767f, 10.8264f)
        lineTo(2.94576f, 10.8264f)
        curveTo(3.59087f, 10.8264f, 4.21881f, 10.6175f, 4.73653f, 10.2308f)
        lineTo(9.63637f, 6.57074f)
        curveTo(10.2015f, 6.14861f, 10.9026f, 5.81146f, 11.5499f, 6.09015f)
        curveTo(12.5976f, 6.5413f, 13.2783f, 7.81411f, 11.7074f, 9.37203f)
        lineTo(9.99906f, 10.9703f)
        lineTo(20.4157f, 10.9703f)
        curveTo(22.4576f, 11.0266f, 22.5589f, 14.3169f, 20.4157f, 14.4576f)
        lineTo(14.4794f, 14.4576f)
        curveTo(14.6704f, 15.9386f, 13.6276f, 22.9153f, 9.21009f, 21.8984f)
        curveTo(9.00021f, 21.8501f, 8.78723f, 21.8019f, 8.57708f, 21.7548f)
        curveTo(7.65888f, 21.549f, 6.02245f, 20.9407f, 5.06576f, 20.27f)
        curveTo(4.06983f, 19.5717f, 3.07783f, 19.8181f, 1.99767f, 19.8181f)
        }
        }.build()

        return _pointingRight01!!
    }

private var _pointingRight01: ImageVector? = null
