package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share02: ImageVector
    get() {
        if (_share02 != null) {
            return _share02!!
        }
        _share02 = ImageVector.Builder(
            name = "Share02",
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
        moveTo(9f, 4.5f)
        curveTo(5.50442f, 5.70104f, 3f, 8.94175f, 3f, 12.7511f)
        curveTo(3f, 13.9579f, 3.25134f, 15.1076f, 3.70591f, 16.1534f)
        moveTo(15f, 4.5f)
        curveTo(18.4956f, 5.70104f, 21f, 8.94175f, 21f, 12.7511f)
        curveTo(21f, 13.7736f, 20.8195f, 14.7552f, 20.4879f, 15.6674f)
        moveTo(16.5f, 20.3296f)
        curveTo(15.1762f, 21.074f, 13.6393f, 21.5f, 12f, 21.5f)
        curveTo(10.3607f, 21.5f, 8.82378f, 21.074f, 7.5f, 20.3296f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5f)
        curveTo(15f, 6.65685f, 13.6569f, 8f, 12f, 8f)
        curveTo(10.3431f, 8f, 9f, 6.65685f, 9f, 5f)
        curveTo(9f, 3.34315f, 10.3431f, 2f, 12f, 2f)
        curveTo(13.6569f, 2f, 15f, 3.34315f, 15f, 5f)
        }
        }.build()

        return _share02!!
    }

private var _share02: ImageVector? = null
