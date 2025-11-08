package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PropertyEdit: ImageVector
    get() {
        if (_propertyEdit != null) {
            return _propertyEdit!!
        }
        _propertyEdit = ImageVector.Builder(
            name = "PropertyEdit",
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
        moveTo(21f, 11.5f)
        curveTo(21f, 7.02166f, 21f, 4.78249f, 19.6088f, 3.39124f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39124f)
        curveTo(2f, 4.78249f, 2f, 7.02166f, 2f, 11.5f)
        curveTo(2f, 15.9783f, 2f, 18.2175f, 3.39124f, 19.6088f)
        curveTo(4.72972f, 20.9472f, 6.85301f, 20.998f, 11f, 20.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        horizontalLineTo(11.5f)
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        moveTo(10f, 12f)
        horizontalLineTo(16f)
        moveTo(6f, 12f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.2633f, 14.8717f)
        curveTo(20.3622f, 13.8651f, 19.8215f, 13.925f, 19.2208f, 14.1048f)
        curveTo(18.8003f, 14.1647f, 17.3585f, 15.8422f, 16.7578f, 16.3765f)
        curveTo(15.7714f, 17.3478f, 14.7806f, 18.3479f, 14.7153f, 18.4784f)
        curveTo(14.5285f, 18.781f, 14.3548f, 19.3172f, 14.2707f, 19.9163f)
        curveTo(14.1145f, 20.815f, 13.8041f, 21.7815f, 14.1746f, 21.9133f)
        curveTo(14.3548f, 22.153f, 15.2559f, 21.8335f, 16.157f, 21.7017f)
        curveTo(16.7578f, 21.5938f, 17.1783f, 21.474f, 17.4787f, 21.2943f)
        curveTo(17.8992f, 21.0426f, 18.6801f, 20.1559f, 20.0258f, 18.8379f)
        curveTo(20.8697f, 17.9521f, 21.6838f, 17.34f, 21.9241f, 16.7409f)
        curveTo(22.1644f, 15.8422f, 21.804f, 15.3629f, 21.2633f, 14.8717f)
        }
        }.build()

        return _propertyEdit!!
    }

private var _propertyEdit: ImageVector? = null
