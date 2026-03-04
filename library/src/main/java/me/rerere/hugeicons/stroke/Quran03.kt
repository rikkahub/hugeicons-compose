package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quran03: ImageVector
    get() {
        if (_quran03 != null) {
            return _quran03!!
        }
        _quran03 = ImageVector.Builder(
            name = "Quran03",
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
        moveTo(20.5f, 17f)
        horizontalLineTo(6f)
        curveTo(4.61929f, 17f, 3.5f, 18.1193f, 3.5f, 19.5f)
        curveTo(3.5f, 20.8807f, 4.61929f, 22f, 6f, 22f)
        horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 22f)
        curveTo(19.1193f, 22f, 18f, 20.8807f, 18f, 19.5f)
        curveTo(18f, 18.1193f, 19.1193f, 17f, 20.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9337f, 10.9999f)
        curveTo(14.3684f, 11.9381f, 13.3397f, 12.5656f, 12.1645f, 12.5656f)
        curveTo(10.3802f, 12.5656f, 8.93375f, 11.1192f, 8.93375f, 9.33487f)
        curveTo(8.93375f, 8.15965f, 9.56125f, 7.13098f, 10.4995f, 6.56564f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 8f)
        horizontalLineTo(13.509f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 19.5f)
        verticalLineTo(5.5f)
        curveTo(3.5f, 3.567f, 5.067f, 2f, 7f, 2f)
        horizontalLineTo(17f)
        curveTo(18.933f, 2f, 20.5f, 3.567f, 20.5f, 5.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _quran03!!
    }

private var _quran03: ImageVector? = null
