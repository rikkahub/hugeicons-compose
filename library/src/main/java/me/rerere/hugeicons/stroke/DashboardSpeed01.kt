package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashboardSpeed01: ImageVector
    get() {
        if (_dashboardSpeed01 != null) {
            return _dashboardSpeed01!!
        }
        _dashboardSpeed01 = ImageVector.Builder(
            name = "DashboardSpeed01",
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
        moveTo(13.5f, 13f)
        lineTo(17f, 9f)
        moveTo(14f, 15f)
        curveTo(14f, 16.1046f, 13.1046f, 17f, 12f, 17f)
        curveTo(10.8954f, 17f, 10f, 16.1046f, 10f, 15f)
        curveTo(10f, 13.8954f, 10.8954f, 13f, 12f, 13f)
        curveTo(13.1046f, 13f, 14f, 13.8954f, 14f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(6f, 8.68629f, 8.68629f, 6f, 12f, 6f)
        curveTo(13.0929f, 6f, 14.1175f, 6.29218f, 15f, 6.80269f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.50006f, 12.0001f)
        curveTo(2.50006f, 7.52172f, 2.50006f, 5.28255f, 3.8913f, 3.8913f)
        curveTo(5.28255f, 2.50006f, 7.52172f, 2.50006f, 12.0001f, 2.50006f)
        curveTo(16.4784f, 2.50006f, 18.7176f, 2.50006f, 20.1088f, 3.8913f)
        curveTo(21.5001f, 5.28255f, 21.5001f, 7.52172f, 21.5001f, 12.0001f)
        curveTo(21.5001f, 16.4784f, 21.5001f, 18.7176f, 20.1088f, 20.1088f)
        curveTo(18.7176f, 21.5001f, 16.4784f, 21.5001f, 12.0001f, 21.5001f)
        curveTo(7.52172f, 21.5001f, 5.28255f, 21.5001f, 3.8913f, 20.1088f)
        curveTo(2.50006f, 18.7176f, 2.50006f, 16.4784f, 2.50006f, 12.0001f)
        }
        }.build()

        return _dashboardSpeed01!!
    }

private var _dashboardSpeed01: ImageVector? = null
