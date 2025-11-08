package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = ImageVector.Builder(
            name = "Pencil",
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
        moveTo(6f, 22f)
        verticalLineTo(13.6944f)
        curveTo(6f, 12.1287f, 6f, 11.3459f, 6.21454f, 10.6077f)
        curveTo(6.42908f, 9.86948f, 6.84589f, 9.21812f, 7.6795f, 7.91542f)
        lineTo(10.3359f, 3.76419f)
        curveTo(11.0885f, 2.58806f, 11.4648f, 2f, 12f, 2f)
        curveTo(12.5352f, 2f, 12.9115f, 2.58806f, 13.6641f, 3.76419f)
        lineTo(16.3205f, 7.91542f)
        curveTo(17.1541f, 9.21812f, 17.5709f, 9.86948f, 17.7855f, 10.6077f)
        curveTo(18f, 11.3459f, 18f, 12.1287f, 18f, 13.6944f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 11f)
        curveTo(7.63152f, 11.3231f, 8.4887f, 11.9732f, 9.28009f, 11.9991f)
        curveTo(10.2988f, 12.0324f, 10.9868f, 11.1372f, 12f, 11.1372f)
        curveTo(13.0132f, 11.1372f, 13.7012f, 12.0324f, 14.7199f, 11.9991f)
        curveTo(15.5113f, 11.9732f, 16.3685f, 11.3231f, 17f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        lineTo(12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5f)
        horizontalLineTo(14f)
        }
        }.build()

        return _pencil!!
    }

private var _pencil: ImageVector? = null
