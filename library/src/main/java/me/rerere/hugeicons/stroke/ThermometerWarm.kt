package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThermometerWarm: ImageVector
    get() {
        if (_thermometerWarm != null) {
            return _thermometerWarm!!
        }
        _thermometerWarm = ImageVector.Builder(
            name = "ThermometerWarm",
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
        moveTo(16.5001f, 22f)
        curveTo(18.7092f, 22f, 20.5001f, 20.2091f, 20.5001f, 18f)
        curveTo(20.5001f, 16.9335f, 20.0827f, 15.9646f, 19.4024f, 15.2475f)
        curveTo(18.8957f, 14.7134f, 18.6424f, 14.4463f, 18.5712f, 14.2679f)
        curveTo(18.5001f, 14.0895f, 18.5001f, 13.8535f, 18.5001f, 13.3815f)
        verticalLineTo(4f)
        curveTo(18.5001f, 2.89543f, 17.6046f, 2f, 16.5001f, 2f)
        curveTo(15.3955f, 2f, 14.5001f, 2.89543f, 14.5001f, 4f)
        verticalLineTo(13.3815f)
        curveTo(14.5001f, 13.8535f, 14.5001f, 14.0895f, 14.4289f, 14.2679f)
        curveTo(14.3577f, 14.4463f, 14.1044f, 14.7134f, 13.5977f, 15.2475f)
        curveTo(12.9174f, 15.9646f, 12.5001f, 16.9335f, 12.5001f, 18f)
        curveTo(12.5001f, 20.2091f, 14.2909f, 22f, 16.5001f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3133f, 15.8303f)
        curveTo(8.67792f, 15.5416f, 7.36329f, 14.104f, 7.20333f, 12.2607f)
        curveTo(7.01373f, 10.076f, 8.51806f, 8.14861f, 10.5634f, 7.95588f)
        curveTo(10.883f, 7.92576f, 11.197f, 7.9398f, 11.5f, 7.99327f)
        moveTo(10.2201f, 4f)
        lineTo(10.323f, 5.18677f)
        moveTo(6.04201f, 7.57572f)
        lineTo(5.18359f, 6.81058f)
        moveTo(4.611f, 12.505f)
        lineTo(3.5f, 12.6097f)
        moveTo(6.86776f, 17.0868f)
        lineTo(6.15499f, 18f)
        }
        }.build()

        return _thermometerWarm!!
    }

private var _thermometerWarm: ImageVector? = null
