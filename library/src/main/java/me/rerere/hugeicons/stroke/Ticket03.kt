package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ticket03: ImageVector
    get() {
        if (_ticket03 != null) {
            return _ticket03!!
        }
        _ticket03 = ImageVector.Builder(
            name = "Ticket03",
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
        moveTo(22f, 8.87895f)
        curveTo(21.9331f, 7.33687f, 21.7456f, 6.33298f, 21.2203f, 5.53884f)
        curveTo(20.9181f, 5.08196f, 20.5428f, 4.68459f, 20.1112f, 4.36468f)
        curveTo(18.9447f, 3.5f, 17.299f, 3.5f, 14.0078f, 3.5f)
        horizontalLineTo(9.99305f)
        curveTo(6.70178f, 3.5f, 5.05614f, 3.5f, 3.88962f, 4.36468f)
        curveTo(3.45805f, 4.68459f, 3.08267f, 5.08196f, 2.78047f, 5.53884f)
        curveTo(2.25526f, 6.33289f, 2.06776f, 7.33665f, 2.00083f, 8.87843f)
        curveTo(1.98938f, 9.14208f, 2.21648f, 9.34375f, 2.46531f, 9.34375f)
        curveTo(3.85109f, 9.34375f, 4.97449f, 10.533f, 4.97449f, 12f)
        curveTo(4.97449f, 13.467f, 3.85109f, 14.6562f, 2.46531f, 14.6562f)
        curveTo(2.21648f, 14.6562f, 1.98938f, 14.8579f, 2.00083f, 15.1216f)
        curveTo(2.06776f, 16.6634f, 2.25526f, 17.6671f, 2.78047f, 18.4612f)
        curveTo(3.08267f, 18.918f, 3.45805f, 19.3154f, 3.88962f, 19.6353f)
        curveTo(5.05614f, 20.5f, 6.70178f, 20.5f, 9.99306f, 20.5f)
        horizontalLineTo(14.0078f)
        curveTo(17.299f, 20.5f, 18.9447f, 20.5f, 20.1112f, 19.6353f)
        curveTo(20.5428f, 19.3154f, 20.9181f, 18.918f, 21.2203f, 18.4612f)
        curveTo(21.7456f, 17.667f, 21.9331f, 16.6631f, 22f, 15.1211f)
        verticalLineTo(8.87895f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        lineTo(17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16f)
        lineTo(17f, 16f)
        }
        }.build()

        return _ticket03!!
    }

private var _ticket03: ImageVector? = null
