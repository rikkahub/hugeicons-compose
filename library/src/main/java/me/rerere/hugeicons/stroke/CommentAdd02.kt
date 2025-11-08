package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CommentAdd02: ImageVector
    get() {
        if (_commentAdd02 != null) {
            return _commentAdd02!!
        }
        _commentAdd02 = ImageVector.Builder(
            name = "CommentAdd02",
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
        moveTo(14f, 6f)
        horizontalLineTo(22f)
        moveTo(18f, 2f)
        lineTo(18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.09881f, 19.5f)
        curveTo(4.7987f, 19.3721f, 3.82475f, 18.9816f, 3.17157f, 18.3284f)
        curveTo(2f, 17.1569f, 2f, 15.2712f, 2f, 11.5f)
        verticalLineTo(11f)
        curveTo(2f, 7.22876f, 2f, 5.34315f, 3.17157f, 4.17157f)
        curveTo(4.34315f, 3f, 6.22876f, 3f, 10f, 3f)
        horizontalLineTo(11.5f)
        moveTo(6.5f, 18f)
        curveTo(6.29454f, 19.0019f, 5.37769f, 21.1665f, 6.31569f, 21.8651f)
        curveTo(6.806f, 22.2218f, 7.58729f, 21.8408f, 9.14987f, 21.0789f)
        curveTo(10.2465f, 20.5441f, 11.3562f, 19.9309f, 12.5546f, 19.655f)
        curveTo(12.9931f, 19.5551f, 13.4395f, 19.5125f, 14f, 19.5f)
        curveTo(17.7712f, 19.5f, 19.6569f, 19.5f, 20.8284f, 18.3284f)
        curveTo(21.947f, 17.2098f, 21.9976f, 15.4403f, 21.9999f, 12f)
        }
        }.build()

        return _commentAdd02!!
    }

private var _commentAdd02: ImageVector? = null
