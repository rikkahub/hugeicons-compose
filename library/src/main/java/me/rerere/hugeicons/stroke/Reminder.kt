package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Reminder: ImageVector
    get() {
        if (_reminder != null) {
            return _reminder!!
        }
        _reminder = ImageVector.Builder(
            name = "Reminder",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.4474f, 19f)
        curveTo(13.3695f, 20.0216f, 13.1757f, 20.6899f, 12.6945f, 21.1799f)
        curveTo(11.8891f, 22f, 10.5927f, 22f, 8f, 22f)
        curveTo(5.40728f, 22f, 4.11091f, 22f, 3.30546f, 21.1799f)
        curveTo(2.5f, 20.3598f, 2.5f, 19.0398f, 2.5f, 16.4f)
        verticalLineTo(11.6f)
        curveTo(2.5f, 8.96011f, 2.5f, 7.64018f, 3.30546f, 6.82007f)
        curveTo(3.79517f, 6.32146f, 4.46634f, 6.126f, 5.5f, 6.04938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99199f, 19.0005f)
        horizontalLineTo(8.00098f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5785f, 2.00055f)
        horizontalLineTo(14.4215f)
        curveTo(11.5208f, 2.00055f, 10.0705f, 2.00055f, 9.20959f, 2.9038f)
        curveTo(8.3487f, 3.80705f, 8.43917f, 5.23383f, 8.62011f, 8.08738f)
        lineTo(8.74595f, 10.0721f)
        curveTo(8.78754f, 10.7279f, 8.80833f, 11.0558f, 8.88194f, 11.3293f)
        curveTo(9.16622f, 12.3855f, 10.0353f, 13.1903f, 11.1225f, 13.4041f)
        curveTo(11.404f, 13.4594f, 11.7373f, 13.4594f, 12.404f, 13.4594f)
        curveTo(13.3328f, 13.4594f, 13.3202f, 14.2266f, 13.3202f, 14.9859f)
        curveTo(13.3202f, 15.575f, 13.3202f, 15.8695f, 13.5121f, 15.9708f)
        curveTo(13.704f, 16.072f, 13.9526f, 15.9086f, 14.4499f, 15.5818f)
        lineTo(17.4093f, 13.6372f)
        curveTo(17.6029f, 13.5099f, 17.7769f, 13.4594f, 18.0048f, 13.4594f)
        curveTo(19.227f, 13.4594f, 19.8381f, 13.4594f, 20.3333f, 13.2756f)
        curveTo(22.0492f, 12.6385f, 22.1918f, 11.0531f, 22.2909f, 9.4905f)
        lineTo(22.3799f, 8.08738f)
        curveTo(22.5608f, 5.23383f, 22.6513f, 3.80705f, 21.7904f, 2.9038f)
        curveTo(20.9295f, 2.00055f, 19.4792f, 2.00055f, 16.5785f, 2.00055f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3342f, 8.42912f)
        curveTo(11.9258f, 6.71484f, 15.4993f, 5.00055f, 15.4993f, 5.00055f)
        curveTo(15.4993f, 5.00055f, 19.0746f, 6.71484f, 16.6663f, 8.42912f)
        moveTo(14.3342f, 8.42912f)
        horizontalLineTo(16.6663f)
        moveTo(14.3342f, 8.42912f)
        lineTo(13.7507f, 11.0005f)
        moveTo(16.6663f, 8.42912f)
        lineTo(17.4821f, 11.0005f)
        }
        }.build()

        return _reminder!!
    }

private var _reminder: ImageVector? = null
