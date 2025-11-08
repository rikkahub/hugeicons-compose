package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = ImageVector.Builder(
            name = "Package",
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
        moveTo(12f, 22f)
        curveTo(11.1818f, 22f, 10.4002f, 21.6698f, 8.83693f, 21.0095f)
        curveTo(4.94564f, 19.3657f, 3f, 18.5438f, 3f, 17.1613f)
        curveTo(3f, 16.7742f, 3f, 10.0645f, 3f, 7f)
        moveTo(12f, 22f)
        curveTo(12.8182f, 22f, 13.5998f, 21.6698f, 15.1631f, 21.0095f)
        curveTo(19.0544f, 19.3657f, 21f, 18.5438f, 21f, 17.1613f)
        verticalLineTo(7f)
        moveTo(12f, 22f)
        lineTo(12f, 11.3548f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.32592f, 9.69138f)
        lineTo(5.40472f, 8.27785f)
        curveTo(3.80157f, 7.5021f, 3f, 7.11423f, 3f, 6.5f)
        curveTo(3f, 5.88577f, 3.80157f, 5.4979f, 5.40472f, 4.72215f)
        lineTo(8.32592f, 3.30862f)
        curveTo(10.1288f, 2.43621f, 11.0303f, 2f, 12f, 2f)
        curveTo(12.9697f, 2f, 13.8712f, 2.4362f, 15.6741f, 3.30862f)
        lineTo(18.5953f, 4.72215f)
        curveTo(20.1984f, 5.4979f, 21f, 5.88577f, 21f, 6.5f)
        curveTo(21f, 7.11423f, 20.1984f, 7.5021f, 18.5953f, 8.27785f)
        lineTo(15.6741f, 9.69138f)
        curveTo(13.8712f, 10.5638f, 12.9697f, 11f, 12f, 11f)
        curveTo(11.0303f, 11f, 10.1288f, 10.5638f, 8.32592f, 9.69138f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        lineTo(8f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4f)
        lineTo(7f, 9f)
        }
        }.build()

        return _package!!
    }

private var _package: ImageVector? = null
