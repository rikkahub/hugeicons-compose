package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TennisRacket: ImageVector
    get() {
        if (_tennisRacket != null) {
            return _tennisRacket!!
        }
        _tennisRacket = ImageVector.Builder(
            name = "TennisRacket",
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
        moveTo(15.5212f, 14.8395f)
        lineTo(7.56291f, 16.438f)
        lineTo(9.16124f, 8.4792f)
        moveTo(18.8695f, 12.9044f)
        curveTo(16.3327f, 15.4414f, 12.5361f, 15.7578f, 10.3896f, 13.6111f)
        curveTo(8.24309f, 11.4644f, 8.55947f, 7.6676f, 11.0963f, 5.13063f)
        curveTo(13.6331f, 2.59366f, 17.4296f, 2.27726f, 19.5762f, 4.42392f)
        curveTo(21.7227f, 6.57059f, 21.4063f, 10.3674f, 18.8695f, 12.9044f)
        moveTo(7.03298f, 15.9067f)
        lineTo(8.09296f, 16.9668f)
        curveTo(8.2881f, 17.1619f, 8.2881f, 17.4783f, 8.09296f, 17.6735f)
        lineTo(4.913f, 20.8536f)
        curveTo(4.71786f, 21.0488f, 4.40148f, 21.0488f, 4.20634f, 20.8536f)
        lineTo(3.14635f, 19.7936f)
        curveTo(2.95122f, 19.5984f, 2.95122f, 19.282f, 3.14635f, 19.0869f)
        lineTo(6.32632f, 15.9067f)
        curveTo(6.52146f, 15.7115f, 6.83784f, 15.7115f, 7.03298f, 15.9067f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5071f, 7.48413f)
        lineTo(16.5f, 7.4912f)
        moveTo(13.5f, 10.5003f)
        lineTo(13.4929f, 10.5074f)
        moveTo(16.5f, 10.5003f)
        lineTo(16.4929f, 10.5074f)
        moveTo(13.5071f, 7.4924f)
        lineTo(13.5f, 7.49947f)
        }
        }.build()

        return _tennisRacket!!
    }

private var _tennisRacket: ImageVector? = null
