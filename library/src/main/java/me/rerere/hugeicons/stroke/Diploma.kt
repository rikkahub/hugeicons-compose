package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = ImageVector.Builder(
            name = "Diploma",
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
        moveTo(18.5f, 17.838f)
        curveTo(19.5305f, 17.6867f, 20.2627f, 17.3941f, 20.8284f, 16.8284f)
        curveTo(22f, 15.6569f, 22f, 13.7712f, 22f, 10f)
        curveTo(22f, 6.22876f, 22f, 4.34315f, 20.8284f, 3.17157f)
        curveTo(19.6569f, 2f, 17.7712f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 2f, 4.34315f, 2f, 3.17157f, 3.17157f)
        curveTo(2f, 4.34315f, 2f, 6.22876f, 2f, 10f)
        curveTo(2f, 13.7712f, 2f, 15.6569f, 3.17157f, 16.8284f)
        curveTo(3.97975f, 17.6366f, 5.1277f, 17.8873f, 7f, 17.965f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        lineTo(7f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 14.5f)
        curveTo(14.5f, 15.8807f, 13.3807f, 17f, 12f, 17f)
        curveTo(10.6193f, 17f, 9.5f, 15.8807f, 9.5f, 14.5f)
        curveTo(9.5f, 13.1193f, 10.6193f, 12f, 12f, 12f)
        curveTo(13.3807f, 12f, 14.5f, 13.1193f, 14.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 14.5f)
        curveTo(9.5f, 18.5659f, 11.2222f, 20.8706f, 12f, 22f)
        lineTo(13.5f, 19f)
        lineTo(15.25f, 20f)
        lineTo(17f, 21f)
        curveTo(16.2653f, 20.2888f, 15.5058f, 18.0471f, 15.5058f, 18.0471f)
        }
        }.build()

        return _diploma!!
    }

private var _diploma: ImageVector? = null
