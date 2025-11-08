package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageOpen: ImageVector
    get() {
        if (_packageOpen != null) {
            return _packageOpen!!
        }
        _packageOpen = ImageVector.Builder(
            name = "PackageOpen",
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
        curveTo(11.1818f, 22f, 10.4002f, 21.6646f, 8.83693f, 20.9939f)
        curveTo(4.94564f, 19.3243f, 3f, 18.4895f, 3f, 17.0853f)
        lineTo(3f, 7.7475f)
        moveTo(12f, 22f)
        curveTo(12.8182f, 22f, 13.5998f, 21.6646f, 15.1631f, 20.9939f)
        curveTo(19.0544f, 19.3243f, 21f, 18.4895f, 21f, 17.0853f)
        verticalLineTo(7.7475f)
        moveTo(12f, 22f)
        lineTo(12f, 12.1707f)
        moveTo(21f, 7.7475f)
        curveTo(21f, 8.35125f, 20.1984f, 8.7325f, 18.5953f, 9.495f)
        lineTo(15.6741f, 10.8844f)
        curveTo(13.8712f, 11.7419f, 12.9697f, 12.1707f, 12f, 12.1707f)
        moveTo(21f, 7.7475f)
        curveTo(21f, 7.14376f, 20.1984f, 6.7625f, 18.5953f, 6f)
        moveTo(3f, 7.7475f)
        curveTo(3f, 8.35125f, 3.80157f, 8.7325f, 5.40472f, 9.495f)
        lineTo(8.32592f, 10.8844f)
        curveTo(10.1288f, 11.7419f, 11.0303f, 12.1707f, 12f, 12.1707f)
        moveTo(3f, 7.7475f)
        curveTo(3f, 7.14376f, 3.80157f, 6.7625f, 5.40472f, 6f)
        moveTo(6.33203f, 13.311f)
        lineTo(8.32591f, 14.2594f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(4f)
        moveTo(16f, 3f)
        lineTo(14.5f, 5f)
        moveTo(8f, 3f)
        lineTo(9.5f, 5f)
        }
        }.build()

        return _packageOpen!!
    }

private var _packageOpen: ImageVector? = null
