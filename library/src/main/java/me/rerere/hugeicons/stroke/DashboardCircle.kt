package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashboardCircle: ImageVector
    get() {
        if (_dashboardCircle != null) {
            return _dashboardCircle!!
        }
        _dashboardCircle = ImageVector.Builder(
            name = "DashboardCircle",
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
        moveTo(21f, 6.75f)
        curveTo(21f, 4.67893f, 19.3211f, 3f, 17.25f, 3f)
        curveTo(15.1789f, 3f, 13.5f, 4.67893f, 13.5f, 6.75f)
        curveTo(13.5f, 8.82107f, 15.1789f, 10.5f, 17.25f, 10.5f)
        curveTo(19.3211f, 10.5f, 21f, 8.82107f, 21f, 6.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 6.75f)
        curveTo(10.5f, 4.67893f, 8.82107f, 3f, 6.75f, 3f)
        curveTo(4.67893f, 3f, 3f, 4.67893f, 3f, 6.75f)
        curveTo(3f, 8.82107f, 4.67893f, 10.5f, 6.75f, 10.5f)
        curveTo(8.82107f, 10.5f, 10.5f, 8.82107f, 10.5f, 6.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17.25f)
        curveTo(21f, 15.1789f, 19.3211f, 13.5f, 17.25f, 13.5f)
        curveTo(15.1789f, 13.5f, 13.5f, 15.1789f, 13.5f, 17.25f)
        curveTo(13.5f, 19.3211f, 15.1789f, 21f, 17.25f, 21f)
        curveTo(19.3211f, 21f, 21f, 19.3211f, 21f, 17.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 17.25f)
        curveTo(10.5f, 15.1789f, 8.82107f, 13.5f, 6.75f, 13.5f)
        curveTo(4.67893f, 13.5f, 3f, 15.1789f, 3f, 17.25f)
        curveTo(3f, 19.3211f, 4.67893f, 21f, 6.75f, 21f)
        curveTo(8.82107f, 21f, 10.5f, 19.3211f, 10.5f, 17.25f)
        }
        }.build()

        return _dashboardCircle!!
    }

private var _dashboardCircle: ImageVector? = null
