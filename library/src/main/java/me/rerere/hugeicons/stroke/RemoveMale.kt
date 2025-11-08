package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RemoveMale: ImageVector
    get() {
        if (_removeMale != null) {
            return _removeMale!!
        }
        _removeMale = ImageVector.Builder(
            name = "RemoveMale",
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
        moveTo(13.5f, 16.0001f)
        verticalLineTo(14.0623f)
        curveTo(15.2808f, 12.6685f, 16.5f, 11f, 16.5f, 7.41681f)
        curveTo(16.5f, 5.09719f, 16.0769f, 3f, 13.5385f, 3f)
        curveTo(13.5385f, 3f, 12.6433f, 2f, 10.4923f, 2f)
        curveTo(7.45474f, 2f, 5.5f, 3.82696f, 5.5f, 7.41681f)
        curveTo(5.5f, 11f, 6.71916f, 12.6686f, 8.5f, 14.0623f)
        verticalLineTo(16.0001f)
        lineTo(4.78401f, 17.1179f)
        curveTo(3.39659f, 17.5424f, 2.36593f, 18.6554f, 2.02375f, 20.0101f)
        curveTo(1.88845f, 20.5457f, 2.35107f, 21.0001f, 2.90639f, 21.0001f)
        horizontalLineTo(14.0936f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22f)
        lineTo(19.5f, 19.5f)
        moveTo(19.5f, 19.5f)
        lineTo(22f, 17f)
        moveTo(19.5f, 19.5f)
        lineTo(17f, 17f)
        moveTo(19.5f, 19.5f)
        lineTo(22f, 22f)
        }
        }.build()

        return _removeMale!!
    }

private var _removeMale: ImageVector? = null
