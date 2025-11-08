package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashboardCircleEdit: ImageVector
    get() {
        if (_dashboardCircleEdit != null) {
            return _dashboardCircleEdit!!
        }
        _dashboardCircleEdit = ImageVector.Builder(
            name = "DashboardCircleEdit",
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.6887f, 3.93395f)
        lineTo(20.0661f, 3.31132f)
        curveTo(19.651f, 2.89623f, 18.978f, 2.89623f, 18.5629f, 3.31131f)
        lineTo(15.2141f, 6.66008f)
        curveTo(14.769f, 7.10522f, 14.4656f, 7.67217f, 14.3421f, 8.28947f)
        lineTo(14f, 10f)
        lineTo(15.7105f, 9.65789f)
        curveTo(16.3278f, 9.53443f, 16.8948f, 9.23101f, 17.3399f, 8.78587f)
        lineTo(20.6887f, 5.43711f)
        curveTo(21.1038f, 5.02202f, 21.1038f, 4.34903f, 20.6887f, 3.93395f)
        }
        }.build()

        return _dashboardCircleEdit!!
    }

private var _dashboardCircleEdit: ImageVector? = null
