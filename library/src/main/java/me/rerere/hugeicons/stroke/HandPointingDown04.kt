package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingDown04: ImageVector
    get() {
        if (_handPointingDown04 != null) {
            return _handPointingDown04!!
        }
        _handPointingDown04 = ImageVector.Builder(
            name = "HandPointingDown04",
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
        moveTo(10.7554f, 13.485f)
        verticalLineTo(19.9954f)
        curveTo(10.7554f, 20.8264f, 10.083f, 21.5f, 9.25361f, 21.5f)
        curveTo(8.42421f, 21.5f, 7.75184f, 20.8264f, 7.75184f, 19.9954f)
        verticalLineTo(9.96807f)
        moveTo(10.7554f, 16.4892f)
        lineTo(11.8098f, 16.4624f)
        curveTo(12.8942f, 16.4347f, 13.7589f, 15.5461f, 13.7589f, 14.4593f)
        verticalLineTo(13.4552f)
        moveTo(13.4777f, 15.4844f)
        lineTo(14.8133f, 15.4297f)
        curveTo(15.8977f, 15.4021f, 16.7625f, 14.5134f, 16.7625f, 13.4266f)
        verticalLineTo(12.4226f)
        moveTo(16.4767f, 14.4593f)
        lineTo(18.0171f, 14.27f)
        curveTo(19.0164f, 14.135f, 19.7591f, 13.2759f, 19.7497f, 12.2657f)
        lineTo(19.7017f, 7.06579f)
        curveTo(19.7017f, 4.88227f, 17.5886f, 2.5f, 15.3226f, 2.5f)
        horizontalLineTo(10.4418f)
        curveTo(9.24956f, 2.5f, 7.8322f, 3.28085f, 6.60739f, 5.34841f)
        lineTo(4.99251f, 7.78577f)
        curveTo(4.41226f, 8.54219f, 3.58594f, 9.90362f, 5.1584f, 11.7712f)
        lineTo(7.75184f, 14.531f)
        }
        }.build()

        return _handPointingDown04!!
    }

private var _handPointingDown04: ImageVector? = null
