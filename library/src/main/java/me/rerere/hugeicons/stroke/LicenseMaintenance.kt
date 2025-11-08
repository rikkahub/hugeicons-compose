package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LicenseMaintenance: ImageVector
    get() {
        if (_licenseMaintenance != null) {
            return _licenseMaintenance!!
        }
        _licenseMaintenance = ImageVector.Builder(
            name = "LicenseMaintenance",
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
        horizontalLineTo(10.5f)
        curveTo(6.72873f, 22f, 4.8431f, 22f, 3.67153f, 20.8284f)
        curveTo(2.49995f, 19.6568f, 2.49997f, 17.7712f, 2.5f, 13.9999f)
        lineTo(2.50004f, 9.99993f)
        curveTo(2.50007f, 6.22872f, 2.50008f, 4.34312f, 3.67166f, 3.17156f)
        curveTo(4.84323f, 2f, 6.72883f, 2f, 10.5f, 2f)
        horizontalLineTo(11.4999f)
        curveTo(15.2712f, 2f, 17.1568f, 2f, 18.3284f, 3.17157f)
        curveTo(19.4999f, 4.34315f, 19.4999f, 6.22876f, 19.4999f, 10f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        moveTo(7f, 12f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 20.7727f)
        curveTo(19.2673f, 20.7727f, 20.7f, 19.3075f, 20.7f, 17.5f)
        curveTo(20.7f, 15.6925f, 19.2673f, 14.2273f, 17.5f, 14.2273f)
        moveTo(17.5f, 20.7727f)
        curveTo(15.7327f, 20.7727f, 14.3f, 19.3075f, 14.3f, 17.5f)
        curveTo(14.3f, 15.6925f, 15.7327f, 14.2273f, 17.5f, 14.2273f)
        moveTo(17.5f, 20.7727f)
        verticalLineTo(22f)
        moveTo(17.5f, 14.2273f)
        verticalLineTo(13f)
        moveTo(14.5913f, 15.7149f)
        lineTo(13.5004f, 15.0455f)
        moveTo(21.5f, 19.9545f)
        lineTo(20.4092f, 19.2851f)
        moveTo(20.4087f, 15.7149f)
        lineTo(21.4996f, 15.0455f)
        moveTo(13.5f, 19.9545f)
        lineTo(14.5908f, 19.2851f)
        }
        }.build()

        return _licenseMaintenance!!
    }

private var _licenseMaintenance: ImageVector? = null
