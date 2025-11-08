package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Comment02: ImageVector
    get() {
        if (_comment02 != null) {
            return _comment02!!
        }
        _comment02 = ImageVector.Builder(
            name = "Comment02",
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
        moveTo(6.09881f, 19f)
        curveTo(4.7987f, 18.8721f, 3.82475f, 18.4816f, 3.17157f, 17.8284f)
        curveTo(2f, 16.6569f, 2f, 14.7712f, 2f, 11f)
        verticalLineTo(10.5f)
        curveTo(2f, 6.72876f, 2f, 4.84315f, 3.17157f, 3.67157f)
        curveTo(4.34315f, 2.5f, 6.22876f, 2.5f, 10f, 2.5f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2.5f, 19.6569f, 2.5f, 20.8284f, 3.67157f)
        curveTo(22f, 4.84315f, 22f, 6.72876f, 22f, 10.5f)
        verticalLineTo(11f)
        curveTo(22f, 14.7712f, 22f, 16.6569f, 20.8284f, 17.8284f)
        curveTo(19.6569f, 19f, 17.7712f, 19f, 14f, 19f)
        curveTo(13.4395f, 19.0125f, 12.9931f, 19.0551f, 12.5546f, 19.155f)
        curveTo(11.3562f, 19.4309f, 10.2465f, 20.0441f, 9.14987f, 20.5789f)
        curveTo(7.58729f, 21.3408f, 6.806f, 21.7218f, 6.31569f, 21.3651f)
        curveTo(5.37769f, 20.6665f, 6.29454f, 18.5019f, 6.5f, 17.5f)
        }
        }.build()

        return _comment02!!
    }

private var _comment02: ImageVector? = null
