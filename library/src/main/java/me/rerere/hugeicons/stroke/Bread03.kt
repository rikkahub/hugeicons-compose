package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bread03: ImageVector
    get() {
        if (_bread03 != null) {
            return _bread03!!
        }
        _bread03 = ImageVector.Builder(
            name = "Bread03",
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
        moveTo(15f, 11f)
        curveTo(15f, 8.23858f, 13.1011f, 6f, 10.7588f, 6f)
        curveTo(9.1261f, 6f, 7.5f, 7f, 7f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        curveTo(19f, 8.79086f, 17.4818f, 7f, 15.609f, 7f)
        curveTo(15.0267f, 7f, 14.4787f, 7.1731f, 14f, 7.47806f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 15.3137f, 17.5228f, 18f, 12f, 18f)
        curveTo(6.47715f, 18f, 2f, 15.3137f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.88973f, 11f)
        curveTo(8.5012f, 9.27477f, 7.13086f, 8f, 5.5f, 8f)
        curveTo(3.567f, 8f, 2f, 9.79086f, 2f, 12f)
        curveTo(2f, 13.6569f, 6.47715f, 15f, 12f, 15f)
        curveTo(17.5228f, 15f, 22f, 13.6569f, 22f, 12f)
        curveTo(22f, 11.0054f, 20.4499f, 9.02165f, 18.5314f, 9.00018f)
        }
        }.build()

        return _bread03!!
    }

private var _bread03: ImageVector? = null
