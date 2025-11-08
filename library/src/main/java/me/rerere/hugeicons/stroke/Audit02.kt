package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Audit02: ImageVector
    get() {
        if (_audit02 != null) {
            return _audit02!!
        }
        _audit02 = ImageVector.Builder(
            name = "Audit02",
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
        moveTo(19f, 11f)
        verticalLineTo(10f)
        curveTo(19f, 6.22876f, 19f, 4.34315f, 17.8284f, 3.17157f)
        curveTo(16.6569f, 2f, 14.7712f, 2f, 11f, 2f)
        curveTo(7.22876f, 2f, 5.34315f, 2f, 4.17157f, 3.17157f)
        curveTo(3f, 4.34315f, 3f, 6.22876f, 3f, 10f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        lineTo(19.2857f, 20.2857f)
        moveTo(19.8571f, 17.4286f)
        curveTo(19.8571f, 19.3221f, 18.3221f, 20.8571f, 16.4286f, 20.8571f)
        curveTo(14.535f, 20.8571f, 13f, 19.3221f, 13f, 17.4286f)
        curveTo(13f, 15.535f, 14.535f, 14f, 16.4286f, 14f)
        curveTo(18.3221f, 14f, 19.8571f, 15.535f, 19.8571f, 17.4286f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        moveTo(7f, 11f)
        horizontalLineTo(11f)
        }
        }.build()

        return _audit02!!
    }

private var _audit02: ImageVector? = null
