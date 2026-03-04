package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FirePit: ImageVector
    get() {
        if (_firePit != null) {
            return _firePit!!
        }
        _firePit = ImageVector.Builder(
            name = "FirePit",
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
        moveTo(8.49989f, 2f)
        curveTo(16.0002f, 2.5f, 14.9999f, 11f, 14.9999f, 11f)
        curveTo(14.9999f, 11f, 17.4349f, 10.5f, 17.9999f, 8.5f)
        curveTo(18.585f, 9.36302f, 18.9763f, 10.8815f, 19.0003f, 12.5f)
        curveTo(19.0459f, 15.57f, 17.5498f, 19f, 12.0002f, 19f)
        curveTo(7.56119f, 19f, 5.00018f, 15.5f, 5.00018f, 13f)
        curveTo(5.00018f, 11f, 5.51966f, 9.75114f, 6.67361f, 8.5f)
        curveTo(9.90182f, 4.99991f, 8.49989f, 2f, 8.49989f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.59855f, 15f)
        curveTo(7.6593f, 12f, 11.0529f, 9f, 11.0529f, 9f)
        curveTo(10.7296f, 10.1667f, 10.471f, 12.7f, 12.0223f, 13.5f)
        curveTo(12.9918f, 14f, 14.4461f, 13f, 14.4461f, 13f)
        curveTo(14.4461f, 13f, 14.9309f, 15.5f, 12.9918f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 20.5f)
        curveTo(7f, 21.3284f, 6.32843f, 22f, 5.5f, 22f)
        curveTo(4.67157f, 22f, 4f, 21.3284f, 4f, 20.5f)
        curveTo(4f, 19.6716f, 4.67157f, 19f, 5.5f, 19f)
        curveTo(6.32843f, 19f, 7f, 19.6716f, 7f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 19f)
        horizontalLineTo(18.5f)
        curveTo(19.3284f, 19f, 20f, 19.6716f, 20f, 20.5f)
        curveTo(20f, 21.3284f, 19.3284f, 22f, 18.5f, 22f)
        horizontalLineTo(5.5f)
        }
        }.build()

        return _firePit!!
    }

private var _firePit: ImageVector? = null
