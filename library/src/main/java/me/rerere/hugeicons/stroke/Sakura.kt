package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sakura: ImageVector
    get() {
        if (_sakura != null) {
            return _sakura!!
        }
        _sakura = ImageVector.Builder(
            name = "Sakura",
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
        moveTo(14f, 12.5f)
        curveTo(14f, 13.6046f, 13.1046f, 14.5f, 12f, 14.5f)
        curveTo(10.8954f, 14.5f, 10f, 13.6046f, 10f, 12.5f)
        curveTo(10f, 11.3954f, 10.8954f, 10.5f, 12f, 10.5f)
        curveTo(13.1046f, 10.5f, 14f, 11.3954f, 14f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18.0876f)
        curveTo(11.8851f, 18.2748f, 11.7593f, 18.4624f, 11.6225f, 18.6497f)
        curveTo(10.309f, 20.4472f, 8.49591f, 21.5041f, 7f, 21.5f)
        lineTo(6.69824f, 19.4251f)
        lineTo(4.62034f, 19.781f)
        curveTo(4.15412f, 18.3677f, 4.64876f, 16.267f, 5.96228f, 14.4694f)
        curveTo(3.93504f, 13.7655f, 2.44173f, 12.3965f, 2f, 11.0004f)
        lineTo(3.85945f, 10.0686f)
        lineTo(2.89359f, 8.20296f)
        curveTo(4.08097f, 7.32031f, 6.42003f, 7.2136f, 8.50944f, 7.90417f)
        curveTo(8.50944f, 5.5f, 9.33594f, 3.36961f, 10.5399f, 2.5f)
        lineTo(12f, 4f)
        lineTo(13.4601f, 2.5f)
        curveTo(14.6641f, 3.36961f, 15.502f, 5.5f, 15.4906f, 7.90417f)
        curveTo(17.58f, 7.2136f, 19.919f, 7.32031f, 21.1064f, 8.20296f)
        lineTo(20.1406f, 10.0686f)
        lineTo(22f, 11.0004f)
        curveTo(21.5583f, 12.3965f, 20.065f, 13.7655f, 18.0377f, 14.4694f)
        curveTo(19.3512f, 16.267f, 19.8459f, 18.3677f, 19.3797f, 19.781f)
        lineTo(17.3018f, 19.4251f)
        lineTo(17f, 21.5f)
        curveTo(15.5041f, 21.5041f, 13.691f, 20.4472f, 12.3775f, 18.6497f)
        curveTo(12.2407f, 18.4624f, 12.1149f, 18.2748f, 12f, 18.0876f)
        }
        }.build()

        return _sakura!!
    }

private var _sakura: ImageVector? = null
