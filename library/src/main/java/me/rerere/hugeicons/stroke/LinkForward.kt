package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkForward: ImageVector
    get() {
        if (_linkForward != null) {
            return _linkForward!!
        }
        _linkForward = ImageVector.Builder(
            name = "LinkForward",
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
        moveTo(13f, 8.5f)
        horizontalLineTo(13.5f)
        verticalLineTo(4.69635f)
        curveTo(13.5f, 4.31176f, 13.8118f, 4f, 14.1963f, 4f)
        curveTo(14.39f, 4f, 14.5749f, 4.08062f, 14.7066f, 4.22252f)
        lineTo(20.6598f, 10.6336f)
        curveTo(20.8785f, 10.8691f, 21f, 11.1786f, 21f, 11.5f)
        curveTo(21f, 11.8214f, 20.8785f, 12.1309f, 20.6598f, 12.3664f)
        lineTo(14.7066f, 18.7775f)
        curveTo(14.5749f, 18.9194f, 14.39f, 19f, 14.1963f, 19f)
        curveTo(13.8118f, 19f, 13.5f, 18.6882f, 13.5f, 18.3037f)
        verticalLineTo(14.5f)
        curveTo(7.94555f, 14.5f, 4.94688f, 18.5162f, 4.19199f, 19.6847f)
        curveTo(4.06738f, 19.8776f, 3.85713f, 20f, 3.6275f, 20f)
        curveTo(3.28094f, 20f, 3f, 19.7191f, 3f, 19.3725f)
        verticalLineTo(18.5f)
        curveTo(3f, 12.9772f, 7.47715f, 8.5f, 13f, 8.5f)
        }
        }.build()

        return _linkForward!!
    }

private var _linkForward: ImageVector? = null
