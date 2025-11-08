package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Reflex: ImageVector
    get() {
        if (_reflex != null) {
            return _reflex!!
        }
        _reflex = ImageVector.Builder(
            name = "Reflex",
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
        moveTo(22.0007f, 10.5f)
        horizontalLineTo(11.8276f)
        curveTo(10.692f, 10.5f, 10.1242f, 10.5f, 9.65783f, 10.7714f)
        curveTo(9.19147f, 11.0428f, 8.91094f, 11.5365f, 8.34989f, 12.5238f)
        lineTo(3.70815f, 21.4524f)
        moveTo(22.0007f, 10.5f)
        curveTo(22.0007f, 9.93982f, 19.9999f, 8.5f, 19.9999f, 8.5f)
        moveTo(22.0007f, 10.5f)
        curveTo(22.0007f, 11.0602f, 19.9999f, 12.5f, 19.9999f, 12.5f)
        moveTo(3.70815f, 21.4524f)
        curveTo(3.23858f, 21.1799f, 3f, 18.794f, 3f, 18.794f)
        moveTo(3.70815f, 21.4524f)
        curveTo(4.17772f, 21.7248f, 6.35295f, 20.7395f, 6.35295f, 20.7395f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9368f, 10.5f)
        curveTo(15.9785f, 10.1889f, 16f, 9.87134f, 16f, 9.54873f)
        curveTo(16f, 5.65582f, 12.866f, 2.5f, 9f, 2.5f)
        curveTo(5.13401f, 2.5f, 2f, 5.65582f, 2f, 9.54873f)
        curveTo(2f, 12.3606f, 3.63505f, 14.8687f, 6f, 16f)
        }
        }.build()

        return _reflex!!
    }

private var _reflex: ImageVector? = null
