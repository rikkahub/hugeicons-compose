package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframesMultipleAdd: ImageVector
    get() {
        if (_keyframesMultipleAdd != null) {
            return _keyframesMultipleAdd!!
        }
        _keyframesMultipleAdd = ImageVector.Builder(
            name = "KeyframesMultipleAdd",
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
        moveTo(6.5f, 6.15642f)
        curveTo(7.16531f, 5.38547f, 7.58503f, 5f, 8.10017f, 5f)
        curveTo(8.73332f, 5f, 9.22232f, 5.58231f, 10.2003f, 6.74694f)
        lineTo(12.4677f, 9.44699f)
        curveTo(13.4892f, 10.6634f, 14f, 11.2716f, 14f, 12f)
        curveTo(14f, 12.7284f, 13.4892f, 13.3366f, 12.4677f, 14.553f)
        lineTo(10.2003f, 17.2531f)
        curveTo(9.22232f, 18.4177f, 8.73332f, 19f, 8.10017f, 19f)
        curveTo(7.58503f, 19f, 7.16531f, 18.6145f, 6.5f, 17.8436f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        lineTo(5f, 9f)
        moveTo(2f, 12f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        lineTo(16.5118f, 14.6032f)
        curveTo(17.5039f, 13.361f, 18f, 12.7398f, 18f, 12f)
        curveTo(18f, 11.2602f, 17.5039f, 10.639f, 16.5118f, 9.39683f)
        lineTo(13f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        lineTo(20.5118f, 14.6032f)
        curveTo(21.5039f, 13.361f, 22f, 12.7398f, 22f, 12f)
        curveTo(22f, 11.2602f, 21.5039f, 10.639f, 20.5118f, 9.39683f)
        lineTo(17f, 5f)
        }
        }.build()

        return _keyframesMultipleAdd!!
    }

private var _keyframesMultipleAdd: ImageVector? = null
