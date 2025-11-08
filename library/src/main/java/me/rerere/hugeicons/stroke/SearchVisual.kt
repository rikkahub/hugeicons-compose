package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchVisual: ImageVector
    get() {
        if (_searchVisual != null) {
            return _searchVisual!!
        }
        _searchVisual = ImageVector.Builder(
            name = "SearchVisual",
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
        moveTo(15.5f, 15.0001f)
        lineTo(17.5f, 17.0001f)
        moveTo(16.5f, 11.5001f)
        curveTo(16.5f, 9.01483f, 14.4853f, 7.00011f, 12f, 7.00011f)
        curveTo(9.51472f, 7.00011f, 7.5f, 9.01483f, 7.5f, 11.5001f)
        curveTo(7.5f, 13.9854f, 9.51472f, 16.0001f, 12f, 16.0001f)
        curveTo(14.4853f, 16.0001f, 16.5f, 13.9854f, 16.5f, 11.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21.5001f)
        curveTo(16.8623f, 21.5001f, 17.7935f, 21.5001f, 18.5391f, 21.2287f)
        curveTo(19.789f, 20.7738f, 20.7737f, 19.7891f, 21.2286f, 18.5392f)
        curveTo(21.5f, 17.7936f, 21.5f, 16.8624f, 21.5f, 15.0001f)
        moveTo(9f, 21.5001f)
        curveTo(7.13769f, 21.5001f, 6.20653f, 21.5001f, 5.46091f, 21.2287f)
        curveTo(4.21096f, 20.7738f, 3.22633f, 19.7891f, 2.77138f, 18.5392f)
        curveTo(2.5f, 17.7936f, 2.5f, 16.8624f, 2.5f, 15.0001f)
        moveTo(9f, 2.50011f)
        curveTo(7.13769f, 2.50011f, 6.20653f, 2.50011f, 5.46091f, 2.77149f)
        curveTo(4.21096f, 3.22643f, 3.22633f, 4.21107f, 2.77138f, 5.46102f)
        curveTo(2.5f, 6.20664f, 2.5f, 7.13779f, 2.5f, 9.00011f)
        moveTo(15f, 2.50011f)
        curveTo(16.8623f, 2.50011f, 17.7935f, 2.50011f, 18.5391f, 2.77149f)
        curveTo(19.789f, 3.22643f, 20.7737f, 4.21107f, 21.2286f, 5.46102f)
        curveTo(21.5f, 6.20664f, 21.5f, 7.13779f, 21.5f, 9.00011f)
        }
        }.build()

        return _searchVisual!!
    }

private var _searchVisual: ImageVector? = null
