package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeviceAccess: ImageVector
    get() {
        if (_deviceAccess != null) {
            return _deviceAccess!!
        }
        _deviceAccess = ImageVector.Builder(
            name = "DeviceAccess",
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
        moveTo(17f, 10f)
        verticalLineTo(9f)
        curveTo(17f, 5.70017f, 17f, 4.05025f, 15.9749f, 3.02513f)
        curveTo(14.9497f, 2f, 13.2998f, 2f, 10f, 2f)
        curveTo(6.70017f, 2f, 5.05025f, 2f, 4.02513f, 3.02513f)
        curveTo(3f, 4.05025f, 3f, 5.70017f, 3f, 9f)
        verticalLineTo(15f)
        curveTo(3f, 18.2998f, 3f, 19.9497f, 4.02513f, 20.9749f)
        curveTo(5.05025f, 22f, 6.70017f, 22f, 10f, 22f)
        curveTo(10.3517f, 22f, 10.6846f, 22f, 11f, 21.9988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 16.5f)
        verticalLineTo(15f)
        curveTo(15.5f, 13.8954f, 16.3954f, 13f, 17.5f, 13f)
        curveTo(18.6046f, 13f, 19.5f, 13.8954f, 19.5f, 15f)
        verticalLineTo(16.5f)
        moveTo(16.75f, 22f)
        horizontalLineTo(18.25f)
        curveTo(19.4228f, 22f, 20.0092f, 22f, 20.4131f, 21.69f)
        curveTo(20.5171f, 21.6102f, 20.6102f, 21.5171f, 20.69f, 21.4131f)
        curveTo(21f, 21.0092f, 21f, 20.4228f, 21f, 19.25f)
        curveTo(21f, 18.0772f, 21f, 17.4908f, 20.69f, 17.0869f)
        curveTo(20.6102f, 16.9829f, 20.5171f, 16.8898f, 20.4131f, 16.81f)
        curveTo(20.0092f, 16.5f, 19.4228f, 16.5f, 18.25f, 16.5f)
        horizontalLineTo(16.75f)
        curveTo(15.5772f, 16.5f, 14.9908f, 16.5f, 14.5869f, 16.81f)
        curveTo(14.4829f, 16.8898f, 14.3898f, 16.9829f, 14.31f, 17.0869f)
        curveTo(14f, 17.4908f, 14f, 18.0772f, 14f, 19.25f)
        curveTo(14f, 20.4228f, 14f, 21.0092f, 14.31f, 21.4131f)
        curveTo(14.3898f, 21.5171f, 14.4829f, 21.6102f, 14.5869f, 21.69f)
        curveTo(14.9908f, 22f, 15.5772f, 22f, 16.75f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 19f)
        verticalLineTo(19.01f)
        }
        }.build()

        return _deviceAccess!!
    }

private var _deviceAccess: ImageVector? = null
