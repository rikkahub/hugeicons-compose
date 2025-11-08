package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DataRecovery: ImageVector
    get() {
        if (_dataRecovery != null) {
            return _dataRecovery!!
        }
        _dataRecovery = ImageVector.Builder(
            name = "DataRecovery",
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
        moveTo(3f, 12f)
        curveTo(3f, 13.6569f, 6.58172f, 15f, 11f, 15f)
        curveTo(11.3387f, 15f, 11.6724f, 14.9921f, 12f, 14.9768f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        verticalLineTo(11.5f)
        moveTo(3f, 5f)
        verticalLineTo(19f)
        curveTo(3f, 20.6569f, 6.58172f, 22f, 11f, 22f)
        curveTo(11.3387f, 22f, 11.6724f, 21.9921f, 12f, 21.9768f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9868f, 14f)
        lineTo(20.4861f, 16.0844f)
        lineTo(19.6566f, 15.5661f)
        curveTo(19.0657f, 15.1173f, 18.3313f, 14.8512f, 17.5354f, 14.8512f)
        curveTo(15.5828f, 14.8512f, 14f, 16.4515f, 14f, 18.4256f)
        curveTo(14f, 20.3997f, 15.5828f, 22f, 17.5354f, 22f)
        curveTo(19.2457f, 22f, 20.6724f, 20.772f, 21f, 19.1405f)
        }
        }.build()

        return _dataRecovery!!
    }

private var _dataRecovery: ImageVector? = null
