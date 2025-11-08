package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EnergyEllipse: ImageVector
    get() {
        if (_energyEllipse != null) {
            return _energyEllipse!!
        }
        _energyEllipse = ImageVector.Builder(
            name = "EnergyEllipse",
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
        moveTo(8.12901f, 11.5977f)
        lineTo(12.128f, 6.20791f)
        curveTo(12.4408f, 5.78638f, 13.027f, 6.04874f, 13.027f, 6.61024f)
        verticalLineTo(10.782f)
        curveTo(13.027f, 11.1183f, 13.2569f, 11.391f, 13.5405f, 11.391f)
        horizontalLineTo(15.4855f)
        curveTo(15.9274f, 11.391f, 16.1629f, 12.0089f, 15.871f, 12.4023f)
        lineTo(11.872f, 17.7921f)
        curveTo(11.5592f, 18.2136f, 10.973f, 17.9513f, 10.973f, 17.3898f)
        verticalLineTo(13.218f)
        curveTo(10.973f, 12.8817f, 10.7431f, 12.609f, 10.4595f, 12.609f)
        horizontalLineTo(8.51449f)
        curveTo(8.07264f, 12.609f, 7.83711f, 11.9911f, 8.12901f, 11.5977f)
        }
        }.build()

        return _energyEllipse!!
    }

private var _energyEllipse: ImageVector? = null
