package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JoggerPants: ImageVector
    get() {
        if (_joggerPants != null) {
            return _joggerPants!!
        }
        _joggerPants = ImageVector.Builder(
            name = "JoggerPants",
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
        moveTo(18.1604f, 5f)
        verticalLineTo(4f)
        curveTo(18.1604f, 3.05719f, 18.1604f, 2.58579f, 17.8596f, 2.29289f)
        curveTo(17.5589f, 2f, 17.0749f, 2f, 16.1069f, 2f)
        horizontalLineTo(7.8931f)
        curveTo(6.92509f, 2f, 6.44109f, 2f, 6.14037f, 2.29289f)
        curveTo(5.83965f, 2.58579f, 5.83965f, 3.05719f, 5.83965f, 4f)
        verticalLineTo(5f)
        moveTo(18.1604f, 5f)
        lineTo(20.8152f, 19.6524f)
        curveTo(21.0124f, 20.7411f, 21.1111f, 21.2855f, 20.8033f, 21.6427f)
        curveTo(20.4956f, 22f, 19.928f, 22f, 18.793f, 22f)
        horizontalLineTo(17.6235f)
        curveTo(16.8926f, 22f, 16.5272f, 22f, 16.2552f, 21.8044f)
        curveTo(15.9833f, 21.6088f, 15.8758f, 21.2686f, 15.6609f, 20.5882f)
        lineTo(13.9626f, 15.2126f)
        curveTo(13.1598f, 12.6711f, 12.7583f, 11.4004f, 12f, 11.4004f)
        curveTo(11.2417f, 11.4004f, 10.8402f, 12.6711f, 10.0374f, 15.2126f)
        lineTo(8.33912f, 20.5882f)
        curveTo(8.12417f, 21.2686f, 8.01669f, 21.6088f, 7.74476f, 21.8044f)
        curveTo(7.47284f, 22f, 7.10738f, 22f, 6.37647f, 22f)
        horizontalLineTo(5.20702f)
        curveTo(4.07196f, 22f, 3.50443f, 22f, 3.19668f, 21.6427f)
        curveTo(2.88893f, 21.2855f, 2.98756f, 20.7411f, 3.18482f, 19.6524f)
        lineTo(5.83965f, 5f)
        moveTo(18.1604f, 5f)
        horizontalLineTo(5.83965f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7.77778f)
        lineTo(12f, 5f)
        lineTo(15f, 10f)
        }
        }.build()

        return _joggerPants!!
    }

private var _joggerPants: ImageVector? = null
