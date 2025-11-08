package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Medicine02: ImageVector
    get() {
        if (_medicine02 != null) {
            return _medicine02!!
        }
        _medicine02 = ImageVector.Builder(
            name = "Medicine02",
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
        moveTo(20.1932f, 12.999f)
        curveTo(21.8501f, 15.8688f, 20.8669f, 19.5383f, 17.9971f, 21.1952f)
        curveTo(15.1273f, 22.8521f, 11.4578f, 21.8688f, 9.80094f, 18.999f)
        moveTo(20.1932f, 12.999f)
        curveTo(18.5364f, 10.1293f, 14.8669f, 9.14604f, 11.9971f, 10.8029f)
        curveTo(9.12734f, 12.4598f, 8.14409f, 16.1293f, 9.80094f, 18.999f)
        moveTo(20.1932f, 12.999f)
        lineTo(9.80094f, 18.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0428f, 5.54203f)
        lineTo(15.1278f, 2.5374f)
        curveTo(17f, 1.43112f, 19.394f, 2.08763f, 20.4749f, 4.00376f)
        curveTo(21.3433f, 5.54315f, 21.1f, 7.4272f, 20f, 8.6822f)
        moveTo(10.0428f, 5.54203f)
        lineTo(4.95785f, 8.54667f)
        curveTo(3.08563f, 9.65294f, 2.44415f, 12.1031f, 3.52508f, 14.0192f)
        curveTo(4.17499f, 15.1713f, 5.29956f, 15.868f, 6.5f, 16f)
        moveTo(10.0428f, 5.54203f)
        lineTo(11.5f, 8f)
        }
        }.build()

        return _medicine02!!
    }

private var _medicine02: ImageVector? = null
