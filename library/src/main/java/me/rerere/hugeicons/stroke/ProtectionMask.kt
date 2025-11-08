package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ProtectionMask: ImageVector
    get() {
        if (_protectionMask != null) {
            return _protectionMask!!
        }
        _protectionMask = ImageVector.Builder(
            name = "ProtectionMask",
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
        moveTo(4.27574f, 22f)
        verticalLineTo(18.4493f)
        curveTo(4.27574f, 17.172f, 3.93486f, 16.5167f, 3.26456f, 15.4113f)
        curveTo(2.46115f, 14.0864f, 2f, 12.5402f, 2f, 10.8889f)
        curveTo(2f, 5.97969f, 6.07554f, 2f, 11.103f, 2f)
        curveTo(15.4666f, 2f, 19.1132f, 4.99817f, 20f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0752f, 14.8454f)
        lineTo(18.991f, 12.4141f)
        curveTo(19.0832f, 12.3568f, 19.1294f, 12.3282f, 19.1753f, 12.3058f)
        curveTo(19.2213f, 12.2834f, 19.2749f, 12.2638f, 19.382f, 12.2245f)
        curveTo(19.933f, 12.0226f, 20.5435f, 11.8047f, 21.0395f, 12.2243f)
        curveTo(21.3015f, 12.4459f, 21.4245f, 12.8352f, 21.6707f, 13.6138f)
        curveTo(21.8649f, 14.2282f, 22.0806f, 14.8351f, 21.9699f, 15.487f)
        curveTo(21.9119f, 15.8283f, 21.7602f, 16.1483f, 21.4567f, 16.7883f)
        lineTo(20.0275f, 19.8024f)
        curveTo(19.4737f, 20.9703f, 19.1968f, 21.5542f, 18.2759f, 21.8609f)
        curveTo(17.3551f, 22.1675f, 16.9484f, 21.9358f, 16.135f, 21.4725f)
        curveTo(12.4487f, 19.3724f, 5.30998f, 13.2604f, 7.36438f, 10.4879f)
        curveTo(8.14017f, 9.44098f, 10.1234f, 9.73499f, 15.0752f, 14.8454f)
        moveTo(15.0752f, 14.8454f)
        lineTo(14.0098f, 20.0793f)
        }
        }.build()

        return _protectionMask!!
    }

private var _protectionMask: ImageVector? = null
