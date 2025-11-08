package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserMultiple03: ImageVector
    get() {
        if (_userMultiple03 != null) {
            return _userMultiple03!!
        }
        _userMultiple03 = ImageVector.Builder(
            name = "UserMultiple03",
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
        moveTo(16.5f, 20f)
        verticalLineTo(17.9704f)
        curveTo(16.5f, 16.7281f, 15.9407f, 15.5099f, 14.8103f, 14.9946f)
        curveTo(13.4315f, 14.3661f, 11.7779f, 14f, 10f, 14f)
        curveTo(8.22212f, 14f, 6.5685f, 14.3661f, 5.18968f, 14.9946f)
        curveTo(4.05927f, 15.5099f, 3.5f, 16.7281f, 3.5f, 17.9704f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 20.001f)
        verticalLineTo(17.9713f)
        curveTo(20.5f, 16.729f, 19.9407f, 15.5109f, 18.8103f, 14.9956f)
        curveTo(18.5497f, 14.8768f, 18.2792f, 14.7673f, 18f, 14.668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4.14453f)
        curveTo(16.4457f, 4.57481f, 17.5f, 5.91408f, 17.5f, 7.49959f)
        curveTo(17.5f, 9.0851f, 16.4457f, 10.4244f, 15f, 10.8547f)
        }
        }.build()

        return _userMultiple03!!
    }

private var _userMultiple03: ImageVector? = null
