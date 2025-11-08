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
        moveTo(21f, 17f)
        horizontalLineTo(6.5f)
        curveTo(5.11929f, 17f, 4f, 18.1193f, 4f, 19.5f)
        curveTo(4f, 20.8807f, 5.11929f, 22f, 6.5f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        curveTo(19.6193f, 22f, 18.5f, 20.8807f, 18.5f, 19.5f)
        curveTo(18.5f, 18.1193f, 19.6193f, 17f, 21f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4337f, 10.9999f)
        curveTo(14.8684f, 11.9381f, 13.8397f, 12.5656f, 12.6645f, 12.5656f)
        curveTo(10.8802f, 12.5656f, 9.43375f, 11.1192f, 9.43375f, 9.33487f)
        curveTo(9.43375f, 8.15965f, 10.0612f, 7.13098f, 10.9995f, 6.56564f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 8f)
        horizontalLineTo(14.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 19.5f)
        verticalLineTo(5.5f)
        curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
        horizontalLineTo(17.5f)
        curveTo(19.433f, 2f, 21f, 3.567f, 21f, 5.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _quran03!!
    }

private var _quran03: ImageVector? = null
