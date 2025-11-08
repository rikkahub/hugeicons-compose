package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EnergyRectangle: ImageVector
    get() {
        if (_energyRectangle != null) {
            return _energyRectangle!!
        }
        _energyRectangle = ImageVector.Builder(
            name = "EnergyRectangle",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

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

        return _energyRectangle!!
    }

private var _energyRectangle: ImageVector? = null
