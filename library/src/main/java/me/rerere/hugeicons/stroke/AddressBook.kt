package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = ImageVector.Builder(
            name = "AddressBook",
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
        moveTo(4.5f, 10f)
        curveTo(4.5f, 6.22876f, 4.5f, 4.34315f, 5.67157f, 3.17157f)
        curveTo(6.84315f, 2f, 8.72876f, 2f, 12.5f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.17157f)
        curveTo(22f, 4.34315f, 22f, 6.22876f, 22f, 10f)
        verticalLineTo(14f)
        curveTo(22f, 17.7712f, 22f, 19.6569f, 20.8284f, 20.8284f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(12.5f)
        curveTo(8.72876f, 22f, 6.84315f, 22f, 5.67157f, 20.8284f)
        curveTo(4.5f, 19.6569f, 4.5f, 17.7712f, 4.5f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.25f, 10.0002f)
        verticalLineTo(12.5002f)
        curveTo(15.25f, 13.3286f, 15.9216f, 14.0002f, 16.75f, 14.0002f)
        curveTo(17.5784f, 14.0002f, 18.25f, 13.3286f, 18.25f, 12.5002f)
        verticalLineTo(12f)
        curveTo(18.25f, 9.23858f, 16.0114f, 7f, 13.25f, 7f)
        curveTo(10.4886f, 7f, 8.25f, 9.23858f, 8.25f, 12f)
        curveTo(8.25f, 14.7614f, 10.4886f, 17f, 13.25f, 17f)
        curveTo(14.3758f, 17f, 15.4147f, 16.6279f, 16.2505f, 16f)
        moveTo(15.25f, 12.0002f)
        curveTo(15.25f, 13.1048f, 14.3546f, 14.0002f, 13.25f, 14.0002f)
        curveTo(12.1454f, 14.0002f, 11.25f, 13.1048f, 11.25f, 12.0002f)
        curveTo(11.25f, 10.8956f, 12.1454f, 10.0002f, 13.25f, 10.0002f)
        curveTo(14.3546f, 10.0002f, 15.25f, 10.8956f, 15.25f, 12.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 6f)
        lineTo(2f, 6f)
        moveTo(4.5f, 12f)
        lineTo(2f, 12f)
        moveTo(4.5f, 18f)
        horizontalLineTo(2f)
        }
        }.build()

        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
