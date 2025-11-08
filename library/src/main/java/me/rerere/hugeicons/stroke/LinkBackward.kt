package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkBackward: ImageVector
    get() {
        if (_linkBackward != null) {
            return _linkBackward!!
        }
        _linkBackward = ImageVector.Builder(
            name = "LinkBackward",
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
        moveTo(11f, 8.5f)
        horizontalLineTo(10.5f)
        verticalLineTo(4.69635f)
        curveTo(10.5f, 4.31176f, 10.1882f, 4f, 9.80365f, 4f)
        curveTo(9.61002f, 4f, 9.42513f, 4.08062f, 9.29338f, 4.22252f)
        lineTo(3.34023f, 10.6336f)
        curveTo(3.12154f, 10.8691f, 3f, 11.1786f, 3f, 11.5f)
        curveTo(3f, 11.8214f, 3.12154f, 12.1309f, 3.34023f, 12.3664f)
        lineTo(9.29338f, 18.7775f)
        curveTo(9.42513f, 18.9194f, 9.61002f, 19f, 9.80365f, 19f)
        curveTo(10.1882f, 19f, 10.5f, 18.6882f, 10.5f, 18.3037f)
        verticalLineTo(14.5f)
        curveTo(16.0544f, 14.5f, 19.0531f, 18.5162f, 19.808f, 19.6847f)
        curveTo(19.9326f, 19.8776f, 20.1429f, 20f, 20.3725f, 20f)
        curveTo(20.7191f, 20f, 21f, 19.7191f, 21f, 19.3725f)
        verticalLineTo(18.5f)
        curveTo(21f, 12.9772f, 16.5228f, 8.5f, 11f, 8.5f)
        }
        }.build()

        return _linkBackward!!
    }

private var _linkBackward: ImageVector? = null
