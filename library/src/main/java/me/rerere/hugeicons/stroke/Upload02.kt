package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Upload02: ImageVector
    get() {
        if (_upload02 != null) {
            return _upload02!!
        }
        _upload02 = ImageVector.Builder(
            name = "Upload02",
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
        moveTo(16.9502f, 8.3183f)
        curveTo(17.198f, 7.68602f, 16.5075f, 6.92738f, 15.1266f, 5.41011f)
        curveTo(13.6701f, 3.80984f, 12.92f, 3.00959f, 11.9999f, 3f)
        curveTo(11.0798f, 3.00959f, 10.3297f, 3.80984f, 8.8732f, 5.41011f)
        curveTo(7.49227f, 6.92738f, 6.80181f, 7.68602f, 7.04953f, 8.3183f)
        curveTo(7.05857f, 8.34138f, 7.06839f, 8.36414f, 7.07898f, 8.38653f)
        curveTo(7.34917f, 8.95795f, 8.24466f, 8.99712f, 9.99989f, 8.9998f)
        verticalLineTo(15.5f)
        curveTo(9.99989f, 15.965f, 9.99989f, 16.1975f, 10.051f, 16.3882f)
        curveTo(10.1897f, 16.9059f, 10.594f, 17.3102f, 11.1117f, 17.4489f)
        curveTo(11.3024f, 17.5f, 11.5349f, 17.5f, 11.9999f, 17.5f)
        curveTo(12.4648f, 17.5f, 12.6973f, 17.5f, 12.8881f, 17.4489f)
        curveTo(13.4057f, 17.3102f, 13.81f, 16.9059f, 13.9487f, 16.3882f)
        curveTo(13.9998f, 16.1975f, 13.9998f, 15.965f, 13.9998f, 15.5f)
        verticalLineTo(8.9998f)
        curveTo(15.7551f, 8.99712f, 16.6506f, 8.95796f, 16.9208f, 8.38653f)
        curveTo(16.9314f, 8.36414f, 16.9412f, 8.34138f, 16.9502f, 8.3183f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.99998f, 21f)
        horizontalLineTo(19f)
        }
        }.build()

        return _upload02!!
    }

private var _upload02: ImageVector? = null
