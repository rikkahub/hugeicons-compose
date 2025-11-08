package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Conversation: ImageVector
    get() {
        if (_conversation != null) {
            return _conversation!!
        }
        _conversation = ImageVector.Builder(
            name = "Conversation",
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
        moveTo(6.99994f, 6f)
        verticalLineTo(5f)
        curveTo(6.99994f, 3.58579f, 6.99994f, 2.87868f, 7.43928f, 2.43934f)
        curveTo(7.87862f, 2f, 8.58573f, 2f, 9.99994f, 2f)
        horizontalLineTo(13.9999f)
        curveTo(15.4142f, 2f, 16.1213f, 2f, 16.5606f, 2.43934f)
        curveTo(16.9999f, 2.87868f, 16.9999f, 3.58579f, 16.9999f, 5f)
        verticalLineTo(6f)
        curveTo(16.9999f, 7.41421f, 16.9999f, 8.12132f, 16.5606f, 8.56066f)
        curveTo(16.1213f, 9f, 15.4142f, 9f, 13.9999f, 9f)
        horizontalLineTo(12.9999f)
        lineTo(9.99994f, 11f)
        verticalLineTo(9f)
        curveTo(8.58573f, 9f, 7.87862f, 9f, 7.43928f, 8.56066f)
        curveTo(6.99994f, 8.12132f, 6.99994f, 7.41421f, 6.99994f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.59f, 18.7408f)
        curveTo(2.96122f, 19.162f, 1.31258f, 20.0221f, 2.31671f, 21.0983f)
        curveTo(2.80722f, 21.624f, 3.35352f, 22f, 4.04036f, 22f)
        horizontalLineTo(5.99997f)
        horizontalLineTo(7.95958f)
        curveTo(8.64642f, 22f, 9.19272f, 21.624f, 9.68323f, 21.0983f)
        curveTo(10.6874f, 20.0221f, 9.03872f, 19.162f, 8.40994f, 18.7408f)
        curveTo(6.93544f, 17.7531f, 5.0645f, 17.7531f, 3.59f, 18.7408f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.59f, 18.7408f)
        curveTo(14.9612f, 19.162f, 13.3126f, 20.0221f, 14.3167f, 21.0983f)
        curveTo(14.8072f, 21.624f, 15.3535f, 22f, 16.0404f, 22f)
        horizontalLineTo(18f)
        horizontalLineTo(19.9596f)
        curveTo(20.6464f, 22f, 21.1927f, 21.624f, 21.6832f, 21.0983f)
        curveTo(22.6874f, 20.0221f, 21.0387f, 19.162f, 20.4099f, 18.7408f)
        curveTo(18.9354f, 17.7531f, 17.0645f, 17.7531f, 15.59f, 18.7408f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99997f, 13.5f)
        curveTo(7.99997f, 14.6046f, 7.10454f, 15.5f, 5.99997f, 15.5f)
        curveTo(4.8954f, 15.5f, 3.99997f, 14.6046f, 3.99997f, 13.5f)
        curveTo(3.99997f, 12.3954f, 4.8954f, 11.5f, 5.99997f, 11.5f)
        curveTo(7.10454f, 11.5f, 7.99997f, 12.3954f, 7.99997f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13.5f)
        curveTo(20f, 14.6046f, 19.1045f, 15.5f, 18f, 15.5f)
        curveTo(16.8954f, 15.5f, 16f, 14.6046f, 16f, 13.5f)
        curveTo(16f, 12.3954f, 16.8954f, 11.5f, 18f, 11.5f)
        curveTo(19.1045f, 11.5f, 20f, 12.3954f, 20f, 13.5f)
        }
        }.build()

        return _conversation!!
    }

private var _conversation: ImageVector? = null
