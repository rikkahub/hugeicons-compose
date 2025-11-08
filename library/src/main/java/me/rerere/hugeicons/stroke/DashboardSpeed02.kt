package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashboardSpeed02: ImageVector
    get() {
        if (_dashboardSpeed02 != null) {
            return _dashboardSpeed02!!
        }
        _dashboardSpeed02 = ImageVector.Builder(
            name = "DashboardSpeed02",
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
        moveTo(12f, 15f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13f)
        curveTo(22f, 7.47715f, 17.5228f, 3f, 12f, 3f)
        curveTo(6.47715f, 3f, 2f, 7.47715f, 2f, 13f)
        }
        }.build()

        return _dashboardSpeed02!!
    }

private var _dashboardSpeed02: ImageVector? = null
