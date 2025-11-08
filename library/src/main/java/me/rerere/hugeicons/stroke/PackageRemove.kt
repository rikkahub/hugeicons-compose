package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageRemove: ImageVector
    get() {
        if (_packageRemove != null) {
            return _packageRemove!!
        }
        _packageRemove = ImageVector.Builder(
            name = "PackageRemove",
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
        moveTo(11f, 22f)
        curveTo(10.1818f, 22f, 9.40019f, 21.6698f, 7.83693f, 21.0095f)
        curveTo(3.94564f, 19.3657f, 2f, 18.5438f, 2f, 17.1613f)
        curveTo(2f, 16.7742f, 2f, 10.0645f, 2f, 7f)
        moveTo(11f, 22f)
        lineTo(11f, 11.3548f)
        moveTo(11f, 22f)
        curveTo(11.6167f, 22f, 12.12f, 21.8124f, 13f, 21.4372f)
        moveTo(20f, 7f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 15f)
        lineTo(19f, 18f)
        moveTo(19f, 18f)
        lineTo(22f, 21f)
        moveTo(19f, 18f)
        lineTo(16f, 21f)
        moveTo(19f, 18f)
        lineTo(22f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.32592f, 9.69138f)
        lineTo(4.40472f, 8.27785f)
        curveTo(2.80157f, 7.5021f, 2f, 7.11423f, 2f, 6.5f)
        curveTo(2f, 5.88577f, 2.80157f, 5.4979f, 4.40472f, 4.72215f)
        lineTo(7.32592f, 3.30862f)
        curveTo(9.12883f, 2.43621f, 10.0303f, 2f, 11f, 2f)
        curveTo(11.9697f, 2f, 12.8712f, 2.4362f, 14.6741f, 3.30862f)
        lineTo(17.5953f, 4.72215f)
        curveTo(19.1984f, 5.4979f, 20f, 5.88577f, 20f, 6.5f)
        curveTo(20f, 7.11423f, 19.1984f, 7.5021f, 17.5953f, 8.27785f)
        lineTo(14.6741f, 9.69138f)
        curveTo(12.8712f, 10.5638f, 11.9697f, 11f, 11f, 11f)
        curveTo(10.0303f, 11f, 9.12883f, 10.5638f, 7.32592f, 9.69138f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        lineTo(7f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4f)
        lineTo(6f, 9f)
        }
        }.build()

        return _packageRemove!!
    }

private var _packageRemove: ImageVector? = null
